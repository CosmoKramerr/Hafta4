package kodlama.io.Devs.dataAccess.abstracts;
import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {

   List<Language> getAll();
   Language getById(int id) throws Exception;
   void create(Language language) throws Exception;
   void update(Language language,int id) throws Exception;
   void delete(int id) throws Exception;

}
