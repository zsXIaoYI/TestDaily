package cn.zsza.designPattern.Factory.zz_02;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
