package eTicaretSimulation;

import eTicaretSimulation.business.abstracts.UserService;
import eTicaretSimulation.business.concretes.AuthManager;
import eTicaretSimulation.business.concretes.EmailManager;
import eTicaretSimulation.business.concretes.UserManager;
import eTicaretSimulation.business.concretes.UserValidationManager;
import eTicaretSimulation.core.AuthService;
import eTicaretSimulation.core.GoogleAuthManagerAdapter;
import eTicaretSimulation.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new InMemoryUserDao());
		AuthService authService = new AuthManager(userService, new UserValidationManager(), new EmailManager());
		authService.register(1, "softtech@gmail.com", "123softtech", "Tarık Barbaros", "Barbaros"); // Başarılı
		authService.register(2, "userand@gmail.com", "şifrevalid", "Tarık Barbarps", "Barbarsdo"); // Başarısız eposta invalid
		authService.register(3, "userand@gmail.com", "t", "Tarık Barbaros", "Barbardf"); // Başarısız şifre invalid
		authService.register(4, "userand@gmail.com", "T", "B", "D"); // Başarısız ad-soyad invalid
		authService.register(5, "userand@gmail.com", "2fgfg64", "Tarık Barbaros", "Barbaros"); // Başarısız e-posta mevcut


		authService.login("halitenes.kalayci@gmail.com", "123halit1234"); // Başarşsşz üye doşrulama yapmamşş.
		userService.verifyUser(1); // Kullanıcıyı dogrulayalım
		authService.login("softtech@gmail.com", "123softtech"); // Başarısız şifre yanlış.
		authService.login("softtech@gmail.com", "123softtech"); // Başarılı
		authService.login("userand@gmail.com", "2fgfg64\""); // Başarşsşz e-posta parola zorunlu

		authService.login("userand@gmail.com", "2fgfg64"); // Başarısız üye doğrulama yapmamış.
		userService.verifyUser(1); // Kullanıcıyı doğrulayalım.
		authService.login("softtech@gmail.com", "123userand1256"); // Başarısız şifre yanlış.
		authService.login("softtech@gmail.com", "123softtech"); // Başarılı.
		authService.login("userand@gmail.com", "2fgfg64"); // Başarısız e-posta parola zorunlu

		
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(6, "userand@gmail.com", "userand123", "Tarık Barbaros", "Barbaros");
		googleAuthService.login("softtech@gmail.com", "123userand1256");
		
		
	}
	
}
© 2021 GitHub, Inc.