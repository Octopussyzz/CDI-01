package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.inject.Inject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GithubUtils {

    @Inject
    private ObjectMapper objectMapper;

    public Githuber parseGithuber(String login) throws MalformedURLException {
        URL url = new URL("https://api.github.com/users/");
        Githuber githuber = null;

        try {
            githuber = objectMapper.readValue(new URL(url + login), Githuber.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return githuber;
    }
}
