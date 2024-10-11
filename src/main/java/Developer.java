public class Developer {
    Command Insert;
    Command Update;
    Command Select;
    Command Delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        Insert = insert;
        Update = update;
        Select = select;
        Delete = delete;
    }
    public void InserdRecord(){
        Insert.execute();
    }
    public void UpdateRecord(){
        Update.execute();
    }
    public void SelectRecord(){
        Select.execute();
    }
    public void DeleteRecord(){
        Delete.execute();
    }
}
