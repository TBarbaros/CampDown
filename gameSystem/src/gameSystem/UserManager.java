package gameSystem;

public class UserManager implements UserService{
    private UserDal _userDal;

    public UserManager(UserDal _userDal) {
        System.out.println(Messages.userTitle);
        this._userDal = _userDal;
    }

    @Override
    public void add(User user) {
        if(user.get_nationalIdentity() =="12345678910" && user.get_dateOfBirth()=="06.08.1999" && user.get_firstName() =="Furkan" && user.get_lastName()=="Paþaoðlu"){
            var result = _userDal.add(user);
            System.out.println(Messages.createdUser +" | "+ Messages.validationUserSuccess);
            System.out.println(Messages.firstName+result.get_firstName() +" "+ Messages.lastName+ result.get_lastName() + " " +Messages.userName+result.get_userName() + " " +Messages.password +result.get_password());
        }
       else{
            System.out.println(Messages.validationUserUnSuccess);
        }
    }

    @Override
    public void delete(User user) {
        var result = _userDal.delete(user);
        System.out.println(Messages.deletedUser);
        System.out.println(Messages.userName+result.get_userName());
    }

    @Override
    public void update(User user) {
        var result = _userDal.update(user);
        System.out.println(Messages.updatedUser);
        System.out.println(Messages.firstName+result.get_firstName() +" "+ Messages.lastName+ result.get_lastName() + " " +Messages.userName+result.get_userName() + " " +Messages.password +result.get_password());
    }
}