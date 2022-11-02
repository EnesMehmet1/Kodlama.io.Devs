package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concrates.langue;

public interface ILangueService {
	List<langue> getAll();
	List<langue> setDelete();
	List<langue> setUpdates();
}
