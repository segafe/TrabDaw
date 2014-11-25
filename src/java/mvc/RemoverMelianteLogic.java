package mvc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import maria.negocios.FichaPolicial;
import maria.persistencia.FichaPoliciaDao;
import mvc.Logica;

public class RemoverMelianteLogic implements Logica {
    @Override
    public String executa(HttpServletRequest request,HttpServletResponse res)throws Exception {

        String id = request.getParameter("id");

        
        FichaPolicial ficha = new FichaPolicial();
        ficha.setId(Long.parseLong(id));

        FichaPoliciaDao dao = new FichaPoliciaDao();
        dao.removeContato(ficha);
        System.out.println("contatoRemovido");

        return "index.jsp";
    }
}