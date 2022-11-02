package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "C#"));
        languages.add(new Language(3, "Kotlin"));
        languages.add(new Language(4, "Python"));
        languages.add(new Language(5, "GO"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }
    @Override
    public Language getById(int id) throws Exception {
        for(Language language : languages){
            if(language.getId() == id){
                return language;
            }
        }
        throw new Exception("There is no such registration");
    }

    @Override
    public void create(Language language) {
        languages.add(language);
    }

    @Override
    public void update(Language language, int id) throws Exception {
        Language language1 = getById(language.getId());
        language1.setName(language.getName());
    }

    @Override
    public void delete(int id) throws Exception {
        Language language1 = getById(id);
        languages.remove(language1);
    }
}
