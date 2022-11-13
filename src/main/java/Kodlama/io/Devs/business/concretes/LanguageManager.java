package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.languageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements languageService{
	private LanguageRepository languagesRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languagesRepository) {
		super();
		this.languagesRepository = languagesRepository;
	}

	@Override
	public List<Language> getAll() {
		return languagesRepository.getAll();
	}
	
	
	@Override
	public List<Language> setUpdate(int id,String name) throws Exception {
		if(name.isEmpty()) {
			throw new Exception("boş bırakılamaz");
		}
		else
		return languagesRepository.setUpdate(id,name);
	}

	@Override
	public List<Language> add(Language language) throws Exception {
		for(Language languages: languagesRepository.getAll()) {
			if(languages.getName()==language.getName()) {
				throw new Exception("isim tekrar edemez");
			}
			else if(languages.getName()==null)
				throw new Exception("Boş geçilemez");
		}
		return languagesRepository.add(language);
	}

	@Override
	public List<Language> delete(int id) {
		return languagesRepository.Delete(id);
	}

	@Override
	public Language getId(int id) {
		return languagesRepository.getId(id);
	}
	
	

}
