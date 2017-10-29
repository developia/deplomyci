package info.developia.deplomyci.cucumber.stepdefs;

import info.developia.deplomyci.DeplomyciApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DeplomyciApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
