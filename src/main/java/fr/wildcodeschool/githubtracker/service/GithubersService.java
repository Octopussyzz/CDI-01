package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithubersService {

    private GithuberDAO githuberDAO;

    @Inject
    public GithubersService(GithuberDAO githuberDAO) {
        this.githuberDAO = githuberDAO;
    }

    public List<Githuber> getAllGithubers() {
        return githuberDAO.getGithubers();
    }

    public Githuber getGithuber(String login) {
        return (Githuber) getAllGithubers().stream()
                .filter(githuber -> githuber.getLogin().equals(login));
    }

    public void track(String login) {
        //TODO
    }
}
