package com.atosdigitalacademy.Forum_V1;

import com.atosdigitalacademy.Forum_V1.Service.SubjectService;
import com.atosdigitalacademy.Forum_V1.Service.dtos.SubjectDTO;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Optional;

@SpringBootApplication

@RequiredArgsConstructor
@ToString
@Service
@Slf4j
public class ForumV1Application implements CommandLineRunner {
    private final SubjectService subjectService;

    public static void main(String[] args) {
        SpringApplication.run(ForumV1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        // Créer et sauvegarder un nouveau sujet
//        SubjectDTO subject = new SubjectDTO();
//        subject.setTitle("Initial Subject");
//        subject.setContent("Initial content.");
//        SubjectDTO savedSubject = subjectService.save(subject);
//        log.info("Sujet sauvegardé : {}", savedSubject); // Affichera le sujet avec les détails

        // Modifier un sujet avec un ID spécifique
//        Long specificId = savedSubject.getId();
//        SubjectDTO updatedSubject = new SubjectDTO();
//        updatedSubject.setTitle("Updated Title for Specific ID");
//        updatedSubject.setContent("Updated content for the specific subject.");

        // Appel de la méthode update avec l'ID spécifique
//        SubjectDTO result = subjectService.update(updatedSubject, specificId);
//        log.info("Sujet modifié avec ID spécifique : {}", result);



        // Rechercher le sujet par ID
       // Long specificId2 = 3L;
//        Optional<SubjectDTO> foundSubject = subjectService.findOne(specificId2);
//        if (foundSubject.isPresent()) {
//            log.info("Sujet trouvé : {}", foundSubject.get());
//        } else {
//            log.error("Sujet non trouvé !");
//        }

        // Lister tous les sujets
//        log.info("Liste de tous les sujets :");
//        subjectService.findAll().forEach(subj -> log.info("{}", subj));

//        // Supprimer le sujet
//        subjectService.delete(specificId2);
//        log.info("Sujet supprimé avec ID : {}", specificId2);
//
//        // Vérifier que le sujet a bien été supprimé
//        Optional<SubjectDTO> deletedSubject = subjectService.findOne(specificId2);
//        if (deletedSubject.isEmpty()) {
//            log.info("Le sujet avec l'ID {} a bien été supprimé.", specificId2);
//        } else {
//            log.error("Erreur : le sujet avec l'ID {} existe toujours !", specificId2);
//        }
    }


}