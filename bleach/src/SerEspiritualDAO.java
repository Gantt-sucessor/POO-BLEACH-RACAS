import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SerEspiritualDAO {

    public int inserirSerEspiritual(SerEspiritual serEspiritual) {
        String sql = "INSERT INTO ser_espiritual (nome, posicao) VALUES (?, ?)";
        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, serEspiritual.getNome());
            stmt.setString(2, serEspiritual.getPosicao());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // Retorna o ID gerado
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Caso falhe
    }


    public void inserirShinigami(Shinigami shinigami) {
        int serEspiritualId = inserirSerEspiritual(shinigami); // Obtemos o ID do SerEspiritual

        if (serEspiritualId != -1) {
            String sql = "INSERT INTO shinigami (ser_espiritual_id, shikai, bankai) VALUES (?, ?, ?)";
            try (Connection conn = ConexaoBanco.conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, serEspiritualId); // A chave estrangeira
                stmt.setString(2, shinigami.getShikai());
                stmt.setString(3, shinigami.getBankai());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public List<Shinigami> listarShinigamis() {
        List<Shinigami> lista = new ArrayList<>();
        String sql = "SELECT * FROM shinigami";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(new Shinigami(
                        rs.getString("nome"),
                        rs.getString("posicao"),
                        rs.getString("shikai"),
                        rs.getString("bankai")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
