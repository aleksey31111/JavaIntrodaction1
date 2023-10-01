/*
Простая Карточная Игра "Угадай, что Дальше"
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cards extends JApplet {
    java.awt.Image cardsImages;
    public void init() {
        cardImages = getImage(getCodeBase(), "smallcards.gif");
        setBackground(new Color(130, 50, 49));
        HighLowCanvas board = new HighLowCanvas();
        getContentPane().add(board, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(220, 200, 180));
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        JButton higher = new JButton("Starshe");
        higher.addActionListener(board);
        buttonPanel.add(lower);
        JButton newGame = new JButton("New Geme");
        newGame.addActionListener(board);
        buttonPanel.add(newGame);
    }
    public Insets getInsets() {
        return new Insets(3, 3, 3, 3);
    }
    class HighLowCanvas extends JPanel implements ActionListener {
        Deck deck; // Колода Карт.
        Hand hand; // Сбрасываемая карта.
        String message; // Сообщение.
        boolean gameInProgress; // Состояние Игры.
        Font bigFont; // Шрифт Отображения Сообщения.
        Font smallFont; // Шрифт Для Отображения Карт.
        HighLowCanvas() {
            setBackground(new  Color(0, 120, 0));
            setForeground(Color.green);
            smallFont = new Font("SansSerif", Font.PLAIN, 12);
            bigFont = new Font("Serif", Font.BOLD, 14);
            doNewGame();
        }
        public void actionPerformed(ActionEvent evt) {
            String command = evt.getActionCommand();
            if (command.equals("Starshe"))
                doHigher();
            else if (command.equals("Mladshe"))
                doLower();
            else if (command.equals("NewGame"))
                doNewGame();
        }
        void doHigher() {
            if (gameInProgress == false) {
                message = "Click \" New Game\" first!";
                repaint();
                return;
            }
            hand.addCard(deck.dealCard());
            int cardCt = hand.getCardCount();
            Card thisCard = hand.getCard(cardCt - 1);
            // Описание предыдуәй Карты.
            Card prevCard = hand.getCard(cardCt - 2);
            if (thisCard.getValue() < prevCard.getValue()) {
                gameInProgress = false;
                message = "Ploho poluchilos!";
            }
            else if (cardCt == 4) {
                gameInProgress = false;
                message = "Ok! You Won!";
            }
            else {
                message = "You are True! Try Again" + cardCt + ".";
            }
            repaint();
            return;
        }
        void doLower() {
            if (gameInProgress == false){
                message = "At first Press \"New Game\" !";
                repaint();
                return;
            }
            hand.addCard(deck.dealCard());
            int cardCt = hand.getCardCount();
            Card thisCard = hand.getCard(cardCt - 1);
            Card prevCard = hand.getCard(cardCt - 2);
            if (thisCard.getValue() > prevCard.getValue()) {
                gameInProgress = false;
                message = "You Loss!!!";
            }
            else if (thisCard.getValue() == prevCard.getValue()) {
                gameInProgress = false;
                message = "Not True.";
            }
            else if (cardCt == 4) {
                gameInProgress = false;
                message = "Excelent! You Won!";
            }
            else{
                message = "True! Try again" + cardCt + ".";
            }
            repaint();
        }
        void doNewGame() {
            if (gameInProgress) {
                message = "Do End The Game!";
                repaint();
                return;
            }
            deck = new Deck();
            hand = new Hand();
            deck.shuffle();
            hand.addCard(deck.dealCard());
            message = "Guess When the Next Card, Higher or Lower?";
            gameInProgress = true;
            repaint();
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(bigFont);
            g.drawString(message, 10, getSize().height-10);
            g.setFont(smallFont);
            int cardCt = hand.getCardCount();
            for (int i = 0; i < cardCt; i++)
                drawCard(g, hand.getCard(i), 30 + i * 70, 10);
            if (gameInProgress)
                drawCard(g, null, 30 + cardCt * 70, 10);
        }
        void drawCard(Graphics g, Card card, int x, int y){
            if (card == null) {
                g.setColor(Color.blue);
                g.fillRect(x, y, 40, 60);
                g.setColor(Color.white);
                g.drawRect(x+3, y+3, 33,53);
                g.drawRect(x+4, y+4, 31, 51);
            }
            else{
                int row = 0;
                switch(card.getSuit()) {
                    case Card.CLUBS: row = 0; break;
                    case Card.HEARTS: row = 1; break;
                    case Card.SPADES: row = 2; break;
                    case Card.DIAMONDS: row = 3; break;
                }
                int sx, sy;
                sx = 40*(card.getValue() - 1);
                sy = 60*row;
                g.drawImage(cardImages, x, y, x+40, y+60,
                        sx, sy, sx+40, sy+60, this);
            }
        }
    }
}
