//Vincenzo D'Aria
//CS-151-03
//Box
public class Box{
    public int leftSide;
    public int rightSide;
    public int topSide;
    public int bottomSide;
    public Box(int left, int right, int top, int bottom){
        leftSide = left;
        rightSide = right;
        topSide = top;
        bottomSide = bottom;
    }
    public boolean isOpen(){
        if (leftSide > (rightSide + topSide + bottomSide)|| 
        rightSide > (leftSide + topSide + bottomSide) ||
        topSide > (leftSide + rightSide + bottomSide) ||
        bottomSide > (leftSide + rightSide + topSide)){
            return true;
        }else{
            return false;
        }
    }
    public boolean isClosed(){
        if (!isOpen()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isSquare(){
        if (leftSide == rightSide && rightSide == topSide && topSide == bottomSide){
            return true;
        }else{
            return false;
        }  
    }
    public boolean isRectangle(){
        if (leftSide == rightSide && topSide == bottomSide && !this.isSquare()){
            return true;
        }else{
            return false;
        }
    }
    public boolean isKite(){
        if ((bottomSide == rightSide && topSide == leftSide && !this.isSquare()) || ((bottomSide == leftSide && topSide == rightSide && !this.isSquare()))){
            return true;
        }else{
            return false;
        }
    }
    public boolean isCrooked(){
        if (!this.isSquare() && !this.isRectangle() && !this.isKite()){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return ((double)leftSide + "-" + (double)rightSide + "-" + (double)topSide + "-" + (double)bottomSide);
    
    }
    public int getLeft(){
        return leftSide;
    }
    public int getRight(){
        return rightSide;
    }
    public int getTop(){
        return topSide;
    }
    public int getBottom(){
        return bottomSide;
    }
    public boolean equals(Box that){
        if (this.getLeft() == that.getLeft() && this.getRight() == that.getRight() && this.getTop() == that.getTop() && this.getBottom() == that.getBottom()||
        (this.getLeft()+this.getRight())==(that.getLeft()+that.getRight()) && (this.getTop()+this.getBottom()) == (that.getTop()+that.getBottom())){
            return true;
        }else{
            return false;
        }
        
    }
}
