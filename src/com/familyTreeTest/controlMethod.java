package com.familyTreeTest;


import java.util.Vector;

public final class controlMethod {
    private controlMethod(){
        //确保其不会被实例化，单例模式
    }

    int upperBound = 0;
    int lowerBound = 0;
    private int total = 0;

    /**
     *
     * method linked to
     * @see controlMethod#ifTerminal(User)
     *
     * ifTermial():用来审查一个用户是否为这一个家系中的末端
     *
     */
    public boolean ifTerminal(User startPoint){
        if(startPoint.getChildren() == null){
            return true;
        }
        return false;
    }
    /**
     *
     * method linked to
     * @see controlMethod#checkParentsAndReturnPatients(User)
     *
     * checkParentsAndReturnPatients(User):以startPoint为原点开始向上检查整个家系中的病人，把他们加入到集合中并返回
     *
     */
    static Vector ret = new Vector();
    static int circulations = 0;
    public void checkParentsAndReturnPatients(User startPoint){
        checkPeers(startPoint);
        if (circulations<upperBound-1) {
            circulations++;
            checkParentsAndReturnPatients(startPoint.getFather());
            checkParentsAndReturnPatients(startPoint.getMather());
            circulations--;//回到上一级之前要将已经累计的代数减去1，然后再回到上一级。
        } else {
            if (startPoint.getFather().ifIll)
                ret.add(startPoint.getFather());
            if (startPoint.getMather().ifIll)
                ret.add(startPoint.getMather());
        }//查找到最高的代际时就不用再向上查找了，检查最高的亲代是否是病人并返回。
    }

    public void checkPeers(User startPoint){
        for (int i = 0; i < startPoint.sibling.length; i++) {
            if (startPoint.ifIll)
                ret.add(startPoint);
            if (startPoint.sibling[i].ifIll)
                ret.add(startPoint.sibling[i]);
        }
    }


    public void checkNextGeneration(User startPoint){
        for (int a = 0;a<1;a++){
            circulations = 0;
        }//reset count of circulation to 0

        if (!ifTerminal(startPoint)){
            if (circulations<lowerBound-1) {
                for (int i = 0; i < startPoint.children.length; i++) {
                    if (startPoint.getChildren(i).ifIll)
                        ret.add(startPoint.getChildren(i));
                }
            }//if this individual is not the final one, check all next generations
        } else {

        }
    }

    /**
     *
     * method linked to
     * @see controlMethod#getRelatedPerson(int, User)
     *
     * getRelatedPerson(int, User):用来
     *
     */
    static private int locationKey = 0;
    public static User[] getRelatedPerson(int total,User startPoint){
        if (locationKey<total) {
            locationKey+=1;
            if (startPoint.getChildren() != null) {
                User[] children = startPoint.getChildren();
                for (int i = 0; i < children.length; i++) {
                    User[] couple = getRelatedPerson(total, children[i]);
                    locationKey-=1;
                    for (int j = 0;j<couple.length;j++){
                        if (couple[j].gender == "male"){
                            //printItems(String uniqueMark,atRow(locationKey))//在具体某一行上输出结果:男生输出？女生输出？
                        } else {
                            //printItems(String uniqueMark,atRow(locationKey))
                        }
                    }
                }
            }
        }
        User[] couple = {startPoint,startPoint.couple};
        return couple;
    }
}
