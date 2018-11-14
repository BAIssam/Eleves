package org.bai.eleve;

import org.bai.eleve.entities.Eleve;
import org.bai.eleve.web.EleveRestService;
import org.bai.eleve.dao.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class ElevesApplication extends SpringBootServletInitializer {
	/*
	@Autowired
	private EleveRepository eleve;
	
	@Autowired
	private EleveRestService eleveRest;
	 */
	
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ElevesApplication.class);
    }
	 
	public static void main(String[] args) {
		SpringApplication.run(ElevesApplication.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		
		eleve.save(new Eleve(
				"2017/2018","ben ahmed", "issam", "9B1",
				Long.valueOf(5375), Long.valueOf(11), Long.valueOf(100),
				"Réussite","Dossier scolaire"
				));
		
		eleve.save(new Eleve(
				"2016/2017","Ben Abdalllah", "Ali", "7B1",
				Long.valueOf(5375), Long.valueOf(11), Long.valueOf(100),
				"Réussite","Dossier scolaire"
				));
		
		eleve.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		
		
		eleveRest.chercherEleve("", "aloulou", "", 0, 5).forEach(c->{
			System.out.println(c.getNom());
		});
		
	}*/
}
