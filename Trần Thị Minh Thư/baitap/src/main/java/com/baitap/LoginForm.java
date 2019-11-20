package com.baitap;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class LoginForm {
    @NotNull
    @Size(min = 5, max = 10, message="Số ký tự tối đa là 10 và tối thiểu là 5")
    String userName;

    @NotNull
    @Size(min=3, max = 7,message="Số ký tự phải lớn hơn 3 và nhỏ hơn 7")
    String password;
    
    @NotNull
    @Size(min=9, max = 9, message= "Số lượng ký tự phải đúng bằng 9")
    String maxmin;
    
    @NotBlank
    @Email(message= "Giá trị phải là email")
    String email;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Future(message="Giá trị nhập phải là ngày trong tương lai")
    Date dateOfFuture;
    
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @FutureOrPresent(message="Giá trị nhập phải là ngày hiện tại hoặc tương lại")
    Date dateFutureOrPresent;
    
    @NotNull
    @Negative(message= "Giá trị nhập phải là số âm")
    int soam;
    
    @NotNull @NotBlank @NotBlank
    String space;
    
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Past(message="Giá trị nhập vào là 1 ngày trong quá khứ")
    Date datePast;
    
    @NotNull
    @Positive(message="Giá trị nhập vào phải lớn hơn 0")
    int Positive;
    
    @NotNull 
    @Min(value=1,message="Giá trị nhập vào phải lớn hơn 1") @Max(value=5, message="Giá trị nhập vào phải bé hơn 5")
    int PositiveMax;
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMaxmin() {
		return maxmin;
	}

	public void setMaxmin(String maxmin) {
		this.maxmin = maxmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfFuture() {
		return dateOfFuture;
	}

	public void setDateOfFuture(Date dateOfFuture) {
		this.dateOfFuture = dateOfFuture;
	}

	public Date getDateFutureOrPresent() {
		return dateFutureOrPresent;
	}

	public void setDateFutureOrPresent(Date dateFutureOrPresent) {
		this.dateFutureOrPresent = dateFutureOrPresent;
	}

	public int getSoam() {
		return soam;
	}

	public void setSoam(int soam) {
		this.soam = soam;
	}

	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}

	public Date getDatePast() {
		return datePast;
	}

	public void setDatePast(Date datePast) {
		this.datePast = datePast;
	}

	public int getPositive() {
		return Positive;
	}

	public void setPositive(int positive) {
		Positive = positive;
	}

	public int getPositiveMax() {
		return PositiveMax;
	}

	public void setPositiveMax(int positiveMax) {
		PositiveMax = positiveMax;
	}

	@Override
	public String toString() {
		return "LoginForm [userName=" + userName + ", password=" + password + ", maxmin=" + maxmin + ", email=" + email
				+ ", dateOfFuture=" + dateOfFuture + ", dateFutureOrPresent=" + dateFutureOrPresent + ", soam=" + soam
				+ ", space=" + space + ", datePast=" + datePast + ", Positive=" + Positive + ", PositiveMax="
				+ PositiveMax + "]";
	}
    
}
