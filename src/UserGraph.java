public class userGraph {


   // private arrayList<Coder> usergraph;

    /* what functions do we need in this class?
        putCoder and putProject:
            (putcoder) create a coder with a heap that contains nodes of all projects.
            then add a node of this new coder class to all existing project's heap. Re-heapify all such heaps.

        updateweight? this is modified by coder or project's set methods.

        if we treat this class as the "brain" of the project:
        what do we need?
        swipe left: (this is considered as "like") we remove the first choice of our heap and heapify.
            But what do we do about this new deleted node? do we put it back? if we do, how do we put it back?
            if we keep a max value of any heap. Do we just put this old node with a max+1? but it changes the value?
            NVM: we just create a new list of "liked user" and add this user to the list "someone likes you" to the receiver?


        swipe right: we set a threshold(say in this case it's 5). after

     */







    public boolean putUser(Coder o) {
        return true;
    }

    public void updateWeight(Coder o) {

    }


}