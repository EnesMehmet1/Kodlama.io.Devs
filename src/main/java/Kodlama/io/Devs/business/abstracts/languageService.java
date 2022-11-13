package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

public interface languageService {
	List<Language> getAll();
	List<Language> setUpdate(int id,String name) throws Exception;
	List<Language> add(Language language) throws Exception;
	List<Language> delete(int id);
	Language getId(int id);
}
