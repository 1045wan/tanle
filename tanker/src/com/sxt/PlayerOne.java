package com.sxt;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class PlayerOne extends Tank{
    private boolean up = false;
    private boolean left = false;
    private boolean right = false;
    private boolean down = false;
	public PlayerOne(String img, int X, int y, GamePanel gamePanel, String upIMg, String leftImg, String rightImg,
			String downImg) {
		super(img, X, y, gamePanel, upIMg, leftImg, rightImg, downImg);
		// TODO �Զ����ɵĹ��캯�����
	}
	//̹���ƶ�����
	 public void keyPressed(KeyEvent e){
	        int key = e.getKeyCode();
	        switch (key){
	            case KeyEvent.VK_A:
	                left = true;
	                break;
	            case KeyEvent.VK_S:
	                down = true;
	                break;
	            case KeyEvent.VK_D:
	                right = true;
	                break;
	            case KeyEvent.VK_W:
	                up = true;
	                break;
	            case KeyEvent.VK_SPACE:
	            	attack();
	            default:
	                break;
	        }
	    }

	    public void keyReleased(KeyEvent e){
	        int key = e.getKeyCode();
	        switch (key){
	            case KeyEvent.VK_A:
	                left = false;
	                break;
	            case KeyEvent.VK_S:
	                down = false;
	                break;
	            case KeyEvent.VK_D:
	                right = false;
	                break;
	            case KeyEvent.VK_W:
	                up = false;
	                break;
	            default:
	                break;
	        }
	    }

	    public void move(){
	        if(left){
	            leftward();
	        }
	        else if(right){
	            rightward();
	        }
	        else if(up){
	            upward();
	        }else if(down){
	            downward();
	        }
	    }
	@Override
	public void paintselft(Graphics g) {
		// TODO �Զ����ɵķ������
		g.drawImage(img,x,y, null);
		move();
	}

	@Override
	public Rectangle getRec() {
		// TODO �Զ����ɵķ������
		return new Rectangle(x,y,width,height);
	}

}