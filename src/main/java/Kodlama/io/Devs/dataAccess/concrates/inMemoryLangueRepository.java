package Kodlama.io.Devs.dataAccess.concrates;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.ILangueRepository;
import Kodlama.io.Devs.entities.concrates.langue;

public class inMemoryLangueRepository implements ILangueRepository{
	List<langue> langues;
	
	public inMemoryLangueRepository() {
		langues=new ArrayList<langue>();
		langues.add(new langue(1,"C#"));
		langues.add(new langue(2,"Java"));
		langues.add(new langue(1,"C++"));
	}

	@Override
	public List<langue> getAll() {
		// TODO Auto-generated method stub
		return langues;
	}

	@Override
	public List<langue> setDelete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<langue> setUpdates() {
		// TODO Auto-generated method stub
		return null;
	}

}
