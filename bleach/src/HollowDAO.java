import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HollowDAO {
    private SerEspiritualDAO serEspiritualDAO = new SerEspiritualDAO();
    
    public void inserirHollow(Hollow hollow) {
        int serEspiritualId = serEspiritualDAO.inserirSerEspiritual(hollow); // Obtemos o ID do SerEspiritual

        if (serEspiritualId != -1) {
            String sql = "INSERT INTO hollow (ser_espiritual_id, cero, resurrection) VALUES (?, ?, ?)";
            try (Connection conn = ConexaoBanco.conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, serEspiritualId); // A chave estrangeira
                stmt.setString(2, hollow.getCero());
                stmt.setString(3, hollow.getResurrection());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Hollow> listarHollow() {
        List<Hollow> lista = new ArrayList<>();
        String sql = "SELECT se.nome, se.posicao, s.cero, s.resurrection " + 
                     "FROM hollow s " + 
                     "JOIN ser_espiritual se ON s.ser_espiritual_id = se.id";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(new Shinigami(
                        rs.getString("nome"),
                        rs.getString("posicao"),
                        rs.getString("cero"),
                        rs.getString("resurrection")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}