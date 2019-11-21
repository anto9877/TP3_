public class File extends TDAAbstrait {


    // Accesseur
    public String getId() { return null; }
    public int getPosition() { return 0; }
    public Object getElement() throws TDAVideException {

        if(debut == null) {
            throw new TDAVideException(" La pile est vide");
        }
        return debut.element;
    }
    // juste un test
    public void test() {

    }

    public void ajoute(Object element) {

    }

    public void supprime() throws TDAVideException {

    }
}
