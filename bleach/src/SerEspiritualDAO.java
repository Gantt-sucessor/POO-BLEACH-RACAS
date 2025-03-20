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

}
