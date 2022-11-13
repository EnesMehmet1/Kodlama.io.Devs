package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	List<Language> setUpdate(int id,String name);
	List<Language> add(Language language);
	List<Language> Delete(int id);
	Language getId(int id);                                           //iid ye gore istenilen sınıf geriye dönüyor.
}
