package com.irvin.shiro.service;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

@Service
public class PasswordHelper {

	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 2;

	public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public String getSalt() {
		return randomNumberGenerator.nextBytes().toHex();
	}

	public String encryptPassword(String password) {
		return encryptPassword(password, getSalt());
	}

	public String encryptPassword(String password, String salt) {

		String newPassword = new SimpleHash(
				algorithmName,
				password,
				ByteSource.Util.bytes(salt),
				hashIterations).toHex();
		return newPassword;
	}

}
