package service;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import dao.AlunoDAO;
import entities.Aluno;

@Component
public class AlunoService {

	private final AlunoDAO alunoDAO;

	public AlunoService(AlunoDAO alunoDAO){
		this.alunoDAO = alunoDAO;
	}
	
	public Aluno get(int matricula){
		return alunoDAO.get(matricula);
	}
	
	public void save(Aluno aluno){
		alunoDAO.saveOrUpdate(aluno);
	}
	
	public List<Aluno> list(){
		return alunoDAO.list();
	}
}
