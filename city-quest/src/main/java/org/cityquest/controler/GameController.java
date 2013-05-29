package org.cityquest.controler;

import org.cityquest.model.Game;
import org.cityquest.services.GameService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;

@ManagedBean
public class GameController implements Serializable {

    @EJB
    private GameService gameService;

    private String gameName;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String save() {
        Game game = new Game();
        game.setName(gameName);
        return "createGame";
    }

    public List list(){
        return gameService.list();
    }

}
