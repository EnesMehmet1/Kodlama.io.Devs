package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concrates.langue;

public interface ILangueRepository {
	List<langue> getAll();
	List<langue> setDelete();
	List<langue> setUpdates();
}
