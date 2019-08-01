package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.*;

@Dependent
public class DumbGithuberDAO implements GithuberDAO {

    public List<Githuber> getGithubers() {

        List<Githuber> list = new ArrayList<Githuber>();
        Githuber andre = new Githuber("Andre", "andre@andre.andre", "Andy", "coucouandy", "www.google.com/images");
        Githuber jean = new Githuber("Jean", "jean@jean.jean", "Jean", "coucoujean", "www.google.com/images");
        Githuber jacques = new Githuber("Jacques", "jacques@jacques.jacques", "Jack", "coucoujack", "www.google.com/images");
        Githuber gold = new Githuber("Gold", "gold@gold.gold", "Goldy", "coucougoldy", "www.google.com/images");
        Githuber man = new Githuber("Man", "man@man.man", "Manu", "coucoumanu", "www.google.com/images");

        list.add(andre);
        list.add(jean);
        list.add(jacques);
        list.add(gold);
        list.add(man);

        return list;
    }

}
