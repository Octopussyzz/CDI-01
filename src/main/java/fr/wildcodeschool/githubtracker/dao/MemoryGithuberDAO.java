package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ApplicationScoped
@InMemory
public class MemoryGithuberDAO implements GithuberDAO {

    @Inject
    GithubUtils githubUtils;

    private Map<String, Githuber> listGithuber = new HashMap<>();

    @Override
    public List<Githuber> getGithubers() {
        return new ArrayList<Githuber>(listGithuber.values());
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        listGithuber.put(githuber.getLogin(), githuber);
    }

    @PostConstruct
    private void addGithubers() {
        try {
            saveGithuber(githubUtils.parseGithuber("Octopussyzz"));
            saveGithuber(githubUtils.parseGithuber("athanyl"));
            saveGithuber(githubUtils.parseGithuber("ClementLecomte"));
            saveGithuber(githubUtils.parseGithuber("smelldat"));
            saveGithuber(githubUtils.parseGithuber("kokogakayui"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
