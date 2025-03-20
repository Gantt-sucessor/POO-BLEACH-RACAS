import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShinigamiDAO {
    private SerEspiritualDAO serEspiritualDAO = new SerEspiritualDAO();
    
    public void inserirShinigami(Shinigami shinigami) {
        int serEspiritualId = serEspiritualDAO.inserirSerEspiritual(shinigami); // Obtemos o ID do SerEspiritual

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
        String sql = "SELECT se.nome, se.posicao, s.shikai, s.bankai " + 
                     "FROM shinigami s " + 
                     "JOIN ser_espiritual se ON s.ser_espiritual_id = se.id";

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