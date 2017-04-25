package cn.zsza.designPattern.Factory.zz_02;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
