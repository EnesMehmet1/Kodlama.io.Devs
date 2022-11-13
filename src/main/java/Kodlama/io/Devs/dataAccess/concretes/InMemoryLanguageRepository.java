package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages=new ArrayList<Language>();
		languages.add(new Language(1,"C"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"JAVA"));
		languages.add(new Language(4,"C++"));
		languages.add(new Language(5,"Kotlin"));
	}


	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}


	@Override
	public List<Language> setUpdate(int id,String name) {
		//languages.get(id).setName("New language"); boyle yapabılrıdk ancak burada lsıtedekı sırayı seçmiş oluyoruz.
		for(Language language:languages) {
			if(language.getId()==id) {
				language.setName(name);
			}
		}
		return languages;
	}


	@Override
	public List<Language> add(Language language) {
//		int sayac=0;
//		for(Language l:languages) { //tüm listeyi dönerek kayıt sayısını sayaca atar ve yeni id sayac+1 olur.
//			sayac++;
//		}
//		languages.add(new Language(sayac+1,"New Language"));
		languages.add(language);
		return languages;          //istenirsa parametre olarak bir nesne alıp onu da ekleyebilir
	}


	@Override
	public List<Language> Delete(int id) {
//		languages.remove(language);   //isterinse ıd istenip for ile listede o id tasıyon dil nesnesı bulunup silinebilir
		for(Language languagee:languages) {
			if(languagee.getId()==id) {
				languages.remove(languagee);
			}
		}
		return languages;
	}


	@Override
	public Language getId(int id) {
		for(Language language: languages) {
			if(language.getId()==id) {
				return language;
			}
		}
		return null;
	}
	
	
}
