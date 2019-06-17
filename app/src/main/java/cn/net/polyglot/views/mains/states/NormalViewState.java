package cn.net.polyglot.views.mains.states;

import cn.net.polyglot.views.mains.MainViewContext;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class NormalViewState extends MainViewState {

    private StackPane root;

    public NormalViewState(MainViewContext context) {
        super(context);
    }

    @Override
    public Node getView() {
        if(root==null)root=createView();
        return root;
    }

    private StackPane createView(){
        StackPane root=new StackPane();
        Label label=new Label("易信");
        label.setFont(new Font(35));
        root.getChildren().add(label);
        StackPane.setAlignment(label,Pos.CENTER);
        return root;
    }
}
