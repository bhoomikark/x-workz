package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.animal.Animal;
import com.xworkz.lilyblossomstore.internal.animal.Dog;


import com.xworkz.lilyblossomstore.internal.animal.Shitzu;
import com.xworkz.lilyblossomstore.internal.iron.Utensils;
import com.xworkz.lilyblossomstore.internal.metal.Aluminium;
import com.xworkz.lilyblossomstore.internal.metal.AluminiumProperties;
import com.xworkz.lilyblossomstore.internal.metal.Metal;

import com.xworkz.lilyblossomstore.internal.iron.Iron;
import com.xworkz.lilyblossomstore.internal.iron.Steel;

import com.xworkz.lilyblossomstore.internal.spell.Spell;
import com.xworkz.lilyblossomstore.internal.vehicle.Car;
import com.xworkz.lilyblossomstore.internal.vehicle.CarBrand;
import com.xworkz.lilyblossomstore.internal.vehicle.Vehicle;
import com.xworkz.lilyblossomstore.internal.appliance.*;
import com.xworkz.lilyblossomstore.internal.bankaccount.*;
import com.xworkz.lilyblossomstore.internal.building.*;
import com.xworkz.lilyblossomstore.internal.computer.*;
import com.xworkz.lilyblossomstore.internal.employee.*;
import com.xworkz.lilyblossomstore.internal.instrument.*;
import com.xworkz.lilyblossomstore.internal.lightsource.*;
import com.xworkz.lilyblossomstore.internal.camera.*;
import com.xworkz.lilyblossomstore.internal.university.*;
import com.xworkz.lilyblossomstore.internal.government.*;
import com.xworkz.lilyblossomstore.internal.painter.*;
import com.xworkz.lilyblossomstore.internal.phone.*;
import com.xworkz.lilyblossomstore.internal.plant.*;
import com.xworkz.lilyblossomstore.internal.bank.*;
import com.xworkz.lilyblossomstore.internal.Lamp.*;
import com.xworkz.lilyblossomstore.internal.watch.*;
import com.xworkz.lilyblossomstore.internal.sport.*;
import com.xworkz.lilyblossomstore.internal.fish.*;
import com.xworkz.lilyblossomstore.internal.toy.*;
import com.xworkz.lilyblossomstore.internal.chair.*;
import com.xworkz.lilyblossomstore.internal.bottle.*;
import com.xworkz.lilyblossomstore.internal.fruit.*;
import com.xworkz.lilyblossomstore.internal.aimodel.*;
import com.xworkz.lilyblossomstore.internal.ink.*;
import com.xworkz.lilyblossomstore.internal.dream.*;
import com.xworkz.lilyblossomstore.internal.potion.*;
import com.xworkz.lilyblossomstore.internal.astronaut.*;
import com.xworkz.lilyblossomstore.internal.currency.*;
import com.xworkz.lilyblossomstore.internal.spell.*;
import com.xworkz.lilyblossomstore.internal.emotion.*;
import com.xworkz.lilyblossomstore.internal.planet.*;
import com.xworkz.lilyblossomstore.internal.culinary.*;
import com.xworkz.lilyblossomstore.internal.medical.*;
import com.xworkz.lilyblossomstore.internal.nature.*;
import com.xworkz.lilyblossomstore.internal.heroes.*;
import com.xworkz.lilyblossomstore.internal.forest.*;
import com.xworkz.lilyblossomstore.internal.architecture.*;
import com.xworkz.lilyblossomstore.internal.store.*;
import com.xworkz.lilyblossomstore.internal.space.*;
import com.xworkz.lilyblossomstore.internal.schooling.*;
import com.xworkz.lilyblossomstore.internal.kitchen.*;
import com.xworkz.lilyblossomstore.internal.tech.*;
import com.xworkz.lilyblossomstore.internal.surrounding.*;
import com.xworkz.lilyblossomstore.internal.light.*;
import com.xworkz.lilyblossomstore.internal.lightsource.*;
import com.xworkz.lilyblossomstore.internal.technology.*;







public class Runner {
        public static void main(String[] args) {
            System.out.println("\n--- 1.Iron and steel Example---");
            Iron iron=new Iron();
            iron.checkRustFormation();
            iron.getDensity();
            iron.conductElectricity();
            iron.getMeltingPoint();
            iron.magneticProperties();
            Iron iron1=new Steel();
            iron1.checkRustFormation();
            iron1.getDensity();
            iron1.conductElectricity();
            iron1.getMeltingPoint();
            iron1.magneticProperties();
            Steel steel=new Steel();
            steel.getDensity();
            steel.checkRustFormation();
            steel.getMeltingPoint();
            steel.magneticProperties();
            steel.conductElectricity();
            Utensils utensils=new Utensils();
            utensils.wash(iron);
            utensils.wash(iron1);
            utensils.wash(steel);

            System.out.println("\n--- 2.Metal and aluminium example---");
            Metal metal = new Metal();
            metal.checkCorrosionResistance();
            metal.getHardness();
            metal.conductHeat();
            metal.getBoilingPoint();
            metal.isMalleable();

            Metal metal1 = new Aluminium();  // Upcasting
            metal1.checkCorrosionResistance();
            metal1.getHardness();
            metal1.conductHeat();
            metal1.getBoilingPoint();
            metal1.isMalleable();

            Aluminium aluminium = new Aluminium();
            aluminium.getHardness();
            aluminium.checkCorrosionResistance();
            aluminium.getBoilingPoint();
            aluminium.isMalleable();
            aluminium.conductHeat();

            AluminiumProperties aluminiumProperties=new AluminiumProperties();
            aluminiumProperties.hard(metal);
            aluminiumProperties.hard(metal1);
            aluminiumProperties.hard(aluminium);


            System.out.println("\n===== 3.VEHICLE & CAR =====");
            Vehicle vehicle = new Vehicle();
            vehicle.startEngine();
            vehicle.stopEngine();
            vehicle.fuelType();
            vehicle.accelerate();
            vehicle.applyBrakes();

            Vehicle vehicle1 = new Car();
            vehicle1.startEngine();
            vehicle1.stopEngine();
            vehicle1.fuelType();
            vehicle1.applyBrakes();
            vehicle1.accelerate();

            Car car=new Car();
            car.startEngine();
            car.stopEngine();
            car.fuelType();
            car.applyBrakes();
            car.accelerate();

            CarBrand carBrand=new CarBrand();
            carBrand.Brand(vehicle);
            carBrand.Brand(vehicle1);
            carBrand.Brand(car);

            System.out.println("\n===== 4.ANIMAL & DOG =====");
            Animal animal = new Dog();
            animal.eat();
            animal.sleep();
            animal.makeSound();
            animal.hunt();
            animal.move();

            Animal animal1 = new Animal();
            animal1.eat();
            animal1.sleep();
            animal1.makeSound();
            animal1.hunt();
            animal1.move();

            Dog dog=new Dog();
            dog.eat();
            dog.sleep();
            dog.makeSound();
            dog.hunt();
            dog.move();

            Shitzu shitzu=new Shitzu();
            shitzu.DogBreed(animal);
            shitzu.DogBreed(animal1);
            shitzu.DogBreed(dog);

            System.out.println("\n===== 5.APPLIANCE & REFRIGERATOR =====");
            Appliance appliance = new Appliance();
            appliance.turnOn();
            appliance.turnOff();
            appliance.adjustSettings();
            appliance.checkWarranty();
            appliance.displayBrand();

            Appliance fridgeAsAppliance = new Refrigerator();
            fridgeAsAppliance.turnOn();
            fridgeAsAppliance.turnOff();
            fridgeAsAppliance.adjustSettings();
            fridgeAsAppliance.checkWarranty();
            fridgeAsAppliance.displayBrand();

            Refrigerator fridge = new Refrigerator();
            fridge.turnOn();
            fridge.turnOff();
            fridge.adjustSettings();
            fridge.checkWarranty();
            fridge.displayBrand();

            ElectricRefrigerator electricRefrigerator=new ElectricRefrigerator();
            electricRefrigerator.Cools(appliance);
            electricRefrigerator.Cools(fridgeAsAppliance);
            electricRefrigerator.Cools(fridge);

            System.out.println("\n===== 6.EMPLOYEE & MANAGER =====");
            Employee employee = new Employee();
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            employee.receiveSalary();
            employee.applyLeave();

            Employee managerAsEmployee = new Manager();
            managerAsEmployee.work();
            managerAsEmployee.takeBreak();
            managerAsEmployee.attendMeeting();
            managerAsEmployee.receiveSalary();
            managerAsEmployee.applyLeave();

            Manager manager = new Manager();
            manager.work();
            manager.takeBreak();
            manager.attendMeeting();
            manager.receiveSalary();
            manager.applyLeave();

            ManagerPA managerPA=new ManagerPA();
            managerPA.allocateSalary(employee);
            managerPA.allocateSalary(managerAsEmployee);
            managerPA.allocateSalary(manager);

            System.out.println("\n===== 7.BANK ACCOUNT & SAVINGS ACCOUNT =====");
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit();
            bankAccount.withdraw();
            bankAccount.checkBalance();
            bankAccount.generateStatement();
            bankAccount.applyLoan();

            BankAccount savingsAsBank = new SavingsAccount();
            savingsAsBank.deposit();
            savingsAsBank.withdraw();
            savingsAsBank.checkBalance();
            savingsAsBank.generateStatement();
            savingsAsBank.applyLoan();

            SavingsAccount savings = new SavingsAccount();
            savings.deposit();
            savings.withdraw();
            savings.checkBalance();
            savings.generateStatement();
            savings.applyLoan();
             GeneralAccount generalAccount=new GeneralAccount();
             generalAccount.generateOTP(bankAccount);
             generalAccount.generateOTP(savingsAsBank);
             generalAccount.generateOTP(savings);

            System.out.println("\n===== 8.BUILDING & HOUSE =====");
            Building building = new Building();
            building.provideShelter();
            building.openDoors();
            building.lockWindows();
            building.turnOnLights();

            Building houseAsBuilding = new House();
            houseAsBuilding.provideShelter();
            houseAsBuilding.openDoors();
            houseAsBuilding.lockWindows();
            houseAsBuilding.turnOnLights();




            House house = new House();
            house.provideShelter();
            house.openDoors();
            house.lockWindows();
            house.turnOnLights();
            house.cleanBuilding();

            BrickBuilding brickBuilding = new BrickBuilding();
            brickBuilding.construct(building);
            brickBuilding.construct(houseAsBuilding);
            brickBuilding.construct(house);

            System.out.println("\n===== 9.COMPUTER & LAPTOP =====");
            Computer computer = new Computer();
            computer.processData();
            computer.runSoftware();
            computer.connectInternet();
            computer.storeData();
            computer.displayOutput();

            Computer laptopAsComputer = new Laptop();
            laptopAsComputer.processData();
            laptopAsComputer.runSoftware();
            laptopAsComputer.connectInternet();
            laptopAsComputer.storeData();
            laptopAsComputer.displayOutput();

            Laptop laptop = new Laptop();
            laptop.processData();
            laptop.runSoftware();
            laptop.connectInternet();
            laptop.storeData();
            laptop.displayOutput();

            LaptopBrand laptopBrand = new LaptopBrand();
            laptopBrand.Brand(computer);
            laptopBrand.Brand(laptopAsComputer);
            laptopBrand.Brand(laptop);

            System.out.println("\n===== 10.INSTRUMENT & GUITAR =====");
            Instrument instrument = new Instrument();
            instrument.playSound();
            instrument.adjustTuning();
            instrument.changeVolume();
            instrument.maintainInstrument();
            instrument.storeInstrument();

            Instrument guitarAsInstrument = new Guitar();
            guitarAsInstrument.playSound();
            guitarAsInstrument.adjustTuning();
            guitarAsInstrument.changeVolume();
            guitarAsInstrument.maintainInstrument();
            guitarAsInstrument.storeInstrument();

            Guitar guitar = new Guitar();
            guitar.playSound();
            guitar.adjustTuning();
            guitar.changeVolume();
            guitar.maintainInstrument();
            guitar.storeInstrument();

            GuitarString guitarString = new GuitarString();
            guitarString.noOfString(instrument);
            guitarString.noOfString(guitarAsInstrument);
            guitarString.noOfString(guitar);

            System.out.println("\n===== 11.LIGHT SOURCE & LED =====");
            LightSource light = new LightSource();
            light.turnOn();
            light.turnOff();
            light.adjustBrightness();
            light.changeColor();
            light.saveEnergy();

            LightSource ledAsLight = new LED();
            ledAsLight.turnOn();
            ledAsLight.turnOff();
            ledAsLight.adjustBrightness();
            ledAsLight.changeColor();
            ledAsLight.saveEnergy();

            LED led = new LED();
            led.turnOn();
            led.turnOff();
            led.adjustBrightness();
            led.changeColor();
            led.saveEnergy();

            TubeYellowLight tube = new TubeYellowLight();
            tube.colorOfLight(light);
            tube.colorOfLight(ledAsLight);
            tube.colorOfLight(led);


            System.out.println("\n===== 12.CAMERA & DSLR =====");
            Camera camera = new Camera();
            camera.capturePhoto();
            camera.recordVideo();
            camera.zoomLens();
            camera.adjustFocus();
            camera.changeMode();

            Camera dslrAsCamera = new DSLR();
            dslrAsCamera.capturePhoto();
            dslrAsCamera.recordVideo();
            dslrAsCamera.zoomLens();
            dslrAsCamera.adjustFocus();
            dslrAsCamera.changeMode();

            DSLR dslr = new DSLR();
            dslr.capturePhoto();
            dslr.recordVideo();
            dslr.zoomLens();
            dslr.adjustFocus();
            dslr.changeMode();

            SLR slr = new SLR();
            slr.view(camera);
            slr.view(dslrAsCamera);
            slr.view(dslr);

            System.out.println("\n===== 13.UNIVERSITY & ENGINEERING COLLEGE =====");
            University university = new University();
            university.offerCourses();
            university.conductExams();
            university.hostEvents();
            university.provideScholarships();
            university.researchPrograms();

            University engAsUniv = new EngineeringCollege();
            engAsUniv.offerCourses();
            engAsUniv.conductExams();
            engAsUniv.hostEvents();
            engAsUniv.provideScholarships();
            engAsUniv.researchPrograms();

            EngineeringCollege enggCollege = new EngineeringCollege();
            enggCollege.offerCourses();
            enggCollege.conductExams();
            enggCollege.hostEvents();
            enggCollege.provideScholarships();
            enggCollege.researchPrograms();
            VTUUniversity vtu = new VTUUniversity();
            vtu.VTU(university);
            vtu.VTU(engAsUniv);
            vtu.VTU(enggCollege);


            System.out.println("\n===== 14.GOVERNMENT & POLICE DEPARTMENT =====");
            Government government = new Government();
            government.makeLaws();
            government.collectTaxes();
            government.provideSecurity();
            government.manageEconomy();
            government.publicServices();

            Government policeAsGov = new PoliceDepartment();
            policeAsGov.makeLaws();
            policeAsGov.collectTaxes();
            policeAsGov.provideSecurity();
            policeAsGov.manageEconomy();
            policeAsGov.publicServices();

            PoliceDepartment policeDept = new PoliceDepartment();
            policeDept.makeLaws();
            policeDept.collectTaxes();
            policeDept.provideSecurity();
            policeDept.manageEconomy();
            policeDept.publicServices();

            GovernmentOfficers officers = new GovernmentOfficers();
            officers.offers(government);
            officers.offers(policeAsGov);
            officers.offers(policeDept);




            System.out.println("\n===== 15.PAINTER & WATERCOLOR ARTIST =====");
            Painter painter = new Painter();
            painter.mixColors();
            painter.drawSketch();
            painter.paintCanvas();
            painter.cleanBrushes();
            painter.framePainting();

            Painter artistAsPainter = new WatercolorArtist();
            artistAsPainter.mixColors();
            artistAsPainter.drawSketch();
            artistAsPainter.paintCanvas();
            artistAsPainter.cleanBrushes();
            artistAsPainter.framePainting();

            WatercolorArtist watercolorArtist = new WatercolorArtist();
            watercolorArtist.mixColors();
            watercolorArtist.drawSketch();
            watercolorArtist.paintCanvas();
            watercolorArtist.cleanBrushes();
            watercolorArtist.framePainting();
            PaintArtist paintArtist = new PaintArtist();
            paintArtist.artistName(painter);
            paintArtist.artistName(artistAsPainter);
            paintArtist.artistName(watercolorArtist);


            System.out.println("\n===== 16.PHONE & SMARTPHONE =====");
            Phone phone = new Phone();
            phone.call();
            phone.message();
            phone.charge();
            phone.connectWifi();
            phone.turnOff();

            Phone phone1 = new Smartphone();
            phone1.call();
            phone1.message();
            phone1.charge();
            phone1.connectWifi();
            phone1.turnOff();

            Smartphone smartphone = new Smartphone();
            smartphone.call();
            smartphone.message();
            smartphone.charge();
            smartphone.connectWifi();
            smartphone.turnOff();
            KeyPad keypad = new KeyPad();
            keypad.dial(phone);
            keypad.dial(phone1);
            keypad.dial(smartphone);


            System.out.println("\n===== 17.PLANT & CACTUS =====");
            Plant plant = new Plant();
            plant.photosynthesize();
            plant.absorbWater();
            plant.grow();
            plant.produceOxygen();
            plant.reproduce();

            Plant plant1 = new Cactus();
            plant1.photosynthesize();
            plant1.absorbWater();
            plant1.grow();
            plant1.produceOxygen();
            plant1.reproduce();

            Cactus cactus = new Cactus();
            cactus.photosynthesize();
            cactus.absorbWater();
            cactus.grow();
            cactus.produceOxygen();
            cactus.reproduce();

            SpinePlant spinePlant = new SpinePlant();
            spinePlant.noOfSpines(plant);
            spinePlant.noOfSpines(plant1);
            spinePlant.noOfSpines(cactus);

            System.out.println("\n===== 18.BANK & ONLINEBANK =====");
            Bank bank = new Bank();
            bank.openAccount();
            bank.closeAccount();
            bank.depositMoney();
            bank.withdrawMoney();
            bank.transferMoney();

            Bank bank1 = new OnlineBank();
            bank1.openAccount();
            bank1.closeAccount();
            bank1.depositMoney();
            bank1.withdrawMoney();
            bank1.transferMoney();

            OnlineBank onlineBank = new OnlineBank();
            onlineBank.openAccount();
            onlineBank.closeAccount();
            onlineBank.depositMoney();
            onlineBank.withdrawMoney();
            onlineBank.transferMoney();
            KaranatakaBank karBank = new KaranatakaBank();
            karBank.PayCash(bank);
            karBank.PayCash(bank1);
            karBank.PayCash(onlineBank);

            System.out.println("\n===== 19.LAMP & LEDLAMP =====");
            Lamp lamp = new Lamp();
            lamp.turnOn();
            lamp.turnOff();
            lamp.adjustBrightness();
            lamp.changeBulb();
            lamp.checkPowerConsumption();

            Lamp lamp1 = new LEDLamp();
            lamp1.turnOn();
            lamp1.turnOff();
            lamp1.adjustBrightness();
            lamp1.changeBulb();
            lamp1.checkPowerConsumption();

            LEDLamp ledLamp = new LEDLamp();
            ledLamp.turnOn();
            ledLamp.turnOff();
            ledLamp.adjustBrightness();
            ledLamp.changeBulb();
            ledLamp.checkPowerConsumption();
            BatteryLamp batteryLamp = new BatteryLamp();
            batteryLamp.lifeSpan(lamp);
            batteryLamp.lifeSpan(lamp1);
            batteryLamp.lifeSpan(ledLamp);


            System.out.println("\n===== 20.WATCH & SMARTWATCH =====");
            Watch watch = new Watch();
            watch.showTime();
            watch.setAlarm();
            watch.stopwatch();
            watch.changeBattery();
            watch.adjustStrap();

            Watch watch1 = new SmartWatch();
            watch1.showTime();
            watch1.setAlarm();
            watch1.stopwatch();
            watch1.changeBattery();
            watch1.adjustStrap();

            SmartWatch smartWatch = new SmartWatch();
            smartWatch.showTime();
            smartWatch.setAlarm();
            smartWatch.stopwatch();
            smartWatch.changeBattery();
            smartWatch.adjustStrap();

            CasioWatch casioWatch = new CasioWatch();
            casioWatch.price(watch);
            casioWatch.price(watch1);
            casioWatch.price(smartWatch);


            System.out.println("\n===== 21.SPORT & CRICKET =====");
            Sport sport = new Sport();
            sport.play();
            sport.stop();
            sport.getRules();
            sport.getPlayers();
            sport.getEquipment();

            Sport sport1 = new Cricket();
            sport1.play();
            sport1.stop();
            sport1.getRules();
            sport1.getPlayers();
            sport1.getEquipment();

            Cricket cricket = new Cricket();
            cricket.play();
            cricket.stop();
            cricket.getRules();
            cricket.getPlayers();
            cricket.getEquipment();

            CricketFranchise franchise = new CricketFranchise();
            franchise.Franchise(sport);
            franchise.Franchise(sport1);
            franchise.Franchise(cricket);
            System.out.println("\n===== 22.FRUIT & MANGO =====");
            Fruit fruit = new Fruit();
            fruit.grow();
            fruit.ripen();
            fruit.eat();
            fruit.getTaste();
            fruit.getNutrition();

            Fruit fruit1 = new Mango();
            fruit1.grow();
            fruit1.ripen();
            fruit1.eat();
            fruit1.getTaste();
            fruit1.getNutrition();

            Mango mango = new Mango();
            mango.grow();
            mango.ripen();
            mango.eat();
            mango.getTaste();
            mango.getNutrition();
            MangoTypes mangoTypes = new MangoTypes();
            mangoTypes.Type(fruit);
            mangoTypes.Type(fruit1);
            mangoTypes.Type(mango);

            System.out.println("\n===== 23.FISH & GOLDFISH =====");
            Fish fish = new Fish();
            fish.swim();
            fish.breatheUnderwater();
            fish.layEggs();
            fish.getColor();
            fish.getSize();

            Fish fish1 = new GoldFish();
            fish1.swim();
            fish1.breatheUnderwater();
            fish1.layEggs();
            fish1.getColor();
            fish1.getSize();

            GoldFish goldfish = new GoldFish();
            goldfish.swim();
            goldfish.breatheUnderwater();
            goldfish.layEggs();
            goldfish.getColor();
            goldfish.getSize();
            Aquarium aquarium = new Aquarium();
            aquarium.diffFish(fish);
            aquarium.diffFish(fish1);

            System.out.println("\n===== 24.TOY & REMOTE CONTROL CAR =====");
            Toy toy = new Toy();
            toy.play();
            toy.getMaterial();
            toy.checkBattery();
            toy.move();
            toy.getColor();

            Toy toy1 = new RemoteControlCar();
            toy1.play();
            toy1.getMaterial();
            toy1.checkBattery();
            toy1.move();
            toy1.getColor();

            RemoteControlCar remoteCar = new RemoteControlCar();
            remoteCar.play();
            remoteCar.getMaterial();
            remoteCar.checkBattery();
            remoteCar.move();
            remoteCar.getColor();
            NarutoToy narutoToy = new NarutoToy();
            narutoToy.gadget(toy);
            narutoToy.gadget(toy1);
            narutoToy.gadget(remoteCar);

            System.out.println("\n===== 25.CHAIR & RECLINER =====");
            Chair chair = new Chair();
            chair.sit();
            chair.adjustHeight();
            chair.recline();
            chair.checkMaterial();
            chair.checkComfort();

            Chair chair1 = new Recliner();
            chair1.sit();
            chair1.adjustHeight();
            chair1.recline();
            chair1.checkMaterial();
            chair1.checkComfort();

            Recliner recliner = new Recliner();
            recliner.sit();
            recliner.adjustHeight();
            recliner.recline();
            recliner.checkMaterial();
            recliner.checkComfort();
            ChairTester tester = new ChairTester();
            tester.checkChair(chair);
            tester.checkChair(chair1);
            tester.checkChair(recliner);

            System.out.println("\n===== 26.BOTTLE & THERMOS =====");
            Bottle bottle = new Bottle();
            bottle.fill();
            bottle.pour();
            bottle.closeCap();
            bottle.checkMaterial();
            bottle.checkCapacity();

            Bottle bottle1 = new Thermos();
            bottle1.fill();
            bottle1.pour();
            bottle1.closeCap();
            bottle1.checkMaterial();
            bottle1.checkCapacity();

            Thermos thermos = new Thermos();
            thermos.fill();
            thermos.pour();
            thermos.closeCap();
            thermos.checkMaterial();
            thermos.checkCapacity();
            Tupperware tupperware = new Tupperware();
            tupperware.noOfBottle(bottle);
            tupperware.noOfBottle(bottle1);
            tupperware.noOfBottle(thermos);

            System.out.println("\n--- 27.Spell and FireSpell Example ---");
            Spell spell = new Spell();
            spell.chant();
            spell.releasePower();
            spell.duration();
            spell.source();

            Spell fireSpell = new FireSpell();
            fireSpell.chant();
            fireSpell.releasePower();
            fireSpell.duration();
            fireSpell.source();

            FireSpell fireSpell2 = new FireSpell();
            fireSpell2.chant();
            fireSpell2.releasePower();
            fireSpell2.duration();
            fireSpell2.source();
            Witch witch = new Witch();
            witch.magicBottle(spell);
            witch.magicBottle(fireSpell2);
            witch.magicBottle(fireSpell);


            System.out.println("\n---  28.Emotion and Happiness Example ---");
            Emotion emotion = new Emotion();
            emotion.trigger();
            emotion.intensity();
            emotion.cause();
            emotion.express();
            emotion.duration();
            Emotion happy = new Happiness();
            happy.trigger();
            happy.intensity();
            happy.cause();
            happy.express();
            happy.duration();
            Happiness happy2 = new Happiness();
            happy2.trigger();
            happy2.intensity();
            happy2.cause();
            happy2.express();
            happy2.duration();
            Pleasure pleasure = new Pleasure();
            pleasure.express(emotion);
            pleasure.express(happy);
            pleasure.express(happy2);

            System.out.println("\n--- 29.AIModel and NeuralNetworkModel Example ---");

            AIModel model = new AIModel();
            model.train();
            model.predict();
            model.optimize();
            model.validate();



            AIModel neuralModel1 = new NeuralNetworkModel();
            neuralModel1.train();
            neuralModel1.predict();
            neuralModel1.optimize();
            neuralModel1.validate();



            NeuralNetworkModel neuralModel2 = new NeuralNetworkModel();
            neuralModel2.train();
            neuralModel2.predict();
            neuralModel2.optimize();
            neuralModel2.validate();

            AIMLModel aimlModel=new AIMLModel();
            aimlModel.learn(model);
            aimlModel.learn(neuralModel1);
            aimlModel.learn(neuralModel2);



            System.out.println("\n--- 30.Currency and Cryptocurrency Example ---");
            Currency currency = new Currency();
            currency.value();
            currency.exchange();
            currency.store();
            currency.regulation();

            Currency crypto = new Cryptocurrency();
            crypto.value();
            crypto.exchange();
            crypto.store();
            crypto.regulation();

            Cryptocurrency crypto2 = new Cryptocurrency();
            crypto2.value();
            crypto2.exchange();
            crypto2.store();
            crypto2.regulation();
            CurrencyUSA currencyUSA = new CurrencyUSA();
            currencyUSA.dollars(currency);
            currencyUSA.dollars(crypto);
            currencyUSA.dollars(crypto2);


            System.out.println("\n--- 31.Astronaut and SpaceTourist Example ---");
            Astronaut astronaut = new Astronaut();
            astronaut.train();
            astronaut.spaceWalk();
            astronaut.research();
            astronaut.eatSpaceFood();
            astronaut.communicate();
            Astronaut tourist = new SpaceTourist();
            tourist.train();
            tourist.spaceWalk();
            tourist.research();
            tourist.eatSpaceFood();
            tourist.communicate();
            SpaceTourist tourist2 = new SpaceTourist();
            tourist2.train();
            tourist2.spaceWalk();
            tourist2.research();
            tourist2.eatSpaceFood();
            tourist2.communicate();
            Cosmonauts cosmonauts = new Cosmonauts();
            cosmonauts.spaceResearch(astronaut);
            cosmonauts.spaceResearch(tourist);
            cosmonauts.spaceResearch(tourist2);


            System.out.println("\n---  32.Ink and InvisibleInk Example ---");
            Ink ink = new Ink();
            ink.color();
            ink.dry();
            ink.permanence();
            ink.use();


            Ink invisibleInk1 = new InvisibleInk();
            invisibleInk1.color();
            invisibleInk1.dry();
            invisibleInk1.permanence();
            invisibleInk1.use();


            InvisibleInk invisibleInk2 = new InvisibleInk();
            invisibleInk2.color();
            invisibleInk2.dry();
            invisibleInk2.permanence();
            invisibleInk2.use();
            BlueInk blueInk = new BlueInk();
            blueInk.inkSpill(ink);
            blueInk.inkSpill(invisibleInk1);
            blueInk.inkSpill(invisibleInk2);


            System.out.println("\n--- 33.Dream and Nightmare Example ---");
            Dream dream = new Dream();
            dream.duration();
            dream.meaning();
            dream.remember();
            dream.influence();

            Dream nightmare = new Nightmare();
            nightmare.duration();
            nightmare.meaning();
            nightmare.remember();
            nightmare.influence();

            Nightmare nightmare2 = new Nightmare();
            nightmare2.duration();

            nightmare2.meaning();
            nightmare2.remember();
            nightmare2.influence();
            GoodDreams dreamHandler = new GoodDreams();
            dreamHandler.happinessDream(dream);
            dreamHandler.happinessDream(nightmare);
            dreamHandler.happinessDream(nightmare2);

            ;

            System.out.println("\n--- 34.Potion and HealingPotion Example ---");
            Potion potion = new Potion();
            potion.taste();
            potion.effect();
            potion.duration();
            potion.ingredients();

            Potion healPotion = new HealingPotion();
            healPotion.taste();
            healPotion.effect();
            healPotion.duration();
            healPotion.ingredients();

            HealingPotion healPotion2 = new HealingPotion();
            healPotion2.taste();
            healPotion2.effect();
            healPotion2.duration();
            healPotion2.ingredients();
            PoisonousPotion handler = new PoisonousPotion();
            handler.harm(potion);
            handler.harm(healPotion);
            handler.harm(healPotion2);

            System.out.println("\n--- 35.Planet and Earth Example ---");
            Planet planet = new Planet();
            planet.rotate();
            planet.revolve();
            planet.hasAtmosphere();
            planet.containsWater();
            planet.supportsLife();


            Planet earth1 = new Earth();
            earth1.rotate();
            earth1.revolve();
            earth1.hasAtmosphere();
            earth1.containsWater();
            earth1.supportsLife();


            Earth earth2 = new Earth();
            earth2.rotate();
            earth2.revolve();
            earth2.hasAtmosphere();
            earth2.containsWater();
            earth2.supportsLife();

            Mars mars = new Mars();
            mars.isAlive(planet);
            mars.isAlive(earth1);
            mars.isAlive(earth2);

            System.out.println("\n--- 37.Chef and pastry Example ---");
            Chef chef = new Chef();
            chef.cook();
            chef.chop();
            chef.season();
            chef.plateDish();
            chef.taste();


            Chef pastryChef1 = new PastryChef();
            pastryChef1.cook();
            pastryChef1.chop();
            pastryChef1.season();
            pastryChef1.plateDish();
            pastryChef1.taste();


            PastryChef pastryChef2 = new PastryChef();
            pastryChef2.cook();
            pastryChef2.chop();
            pastryChef2.season();
            pastryChef2.plateDish();
            pastryChef2.taste();
            PizzaChef pizzaChef = new PizzaChef();
            pizzaChef.bakePizza(chef);
            pizzaChef.bakePizza(pastryChef1);
            pizzaChef.bakePizza(pastryChef2);
            System.out.println("\n--- 38.Doctor and surgeon Example ---");
            Doctor doctor = new Doctor();
            doctor.diagnose();
            doctor.prescribeMedicine();
            doctor.performCheckup();
            doctor.giveAdvice();
            doctor.reviewTests();


            Doctor surgeon1 = new Surgeon();
            surgeon1.diagnose();
            surgeon1.prescribeMedicine();
            surgeon1.performCheckup();
            surgeon1.giveAdvice();
            surgeon1.reviewTests();


            Surgeon surgeon2 = new Surgeon();
            surgeon2.diagnose();
            surgeon2.prescribeMedicine();
            surgeon2.performCheckup();
            surgeon2.giveAdvice();
            surgeon2.reviewTests();
            Patient patient = new Patient();
            patient.noOfPatients();
            patient.consultDoctor(doctor);
            patient.consultDoctor(surgeon1);
            patient.consultDoctor(surgeon2);

            System.out.println("\n--- 39.Mountain and everest Example ---");
            Mountain mountain = new Mountain();
            mountain.getHeight();
            mountain.isClimbable();
            mountain.hasSnow();
            mountain.location();
            mountain.ecosystem();


            Mountain everest1 = new Everest();
            everest1.getHeight();
            everest1.isClimbable();
            everest1.hasSnow();
            everest1.location();
            everest1.ecosystem();


            Everest everest2 = new Everest();
            everest2.getHeight();
            everest2.isClimbable();
            everest2.hasSnow();
            everest2.location();
            everest2.ecosystem();
            AmazonForest amazonForest = new AmazonForest();
            amazonForest.noOfTrees(mountain);
            amazonForest.noOfTrees(everest1);
            amazonForest.noOfTrees(everest2);

            System.out.println("\n--- 40.Superhero and  Example ---");
            SuperHero hero = new SuperHero();
            hero.fightCrime();
            hero.usePowers();
            hero.rescuePeople();
            hero.wearSuit();
            hero.getAlias();



            SuperHero spiderman1 = new Spiderman();
            spiderman1.fightCrime();
            spiderman1.usePowers();
            spiderman1.rescuePeople();
            spiderman1.wearSuit();
            spiderman1.getAlias();


            Spiderman spiderman2 = new Spiderman();
            spiderman2.fightCrime();
            spiderman2.usePowers();
            spiderman2.rescuePeople();
            spiderman2.wearSuit();
            spiderman2.getAlias();
            MarvelHero marvelHero = new MarvelHero();
            marvelHero.fight(hero);
            marvelHero.fight(spiderman1);
            marvelHero.fight(spiderman2);


            System.out.println("\n--- 41.Bird and parrot Example ---");
            Bird bird = new Bird();
            bird.fly();
            bird.sing();
            bird.eat();
            bird.buildNest();
            bird.migrate();


            Bird parrot1 = new Parrot();
            parrot1.fly();
            parrot1.sing();
            parrot1.eat();
            parrot1.buildNest();
            parrot1.migrate();


            Parrot parrot2 = new Parrot();
            parrot2.fly();
            parrot2.sing();
            parrot2.eat();
            parrot2.buildNest();
            parrot2.migrate();
            ParrotBreed breedHandler = new ParrotBreed();
            breedHandler.type(bird);
            breedHandler.type(parrot1);
            breedHandler.type(parrot2);

            System.out.println("\n--- 42. Building Example ---");
            Home home = new Home();
            home.provideShelter();
            home.hasFloors();
            home.hasWindows();
            home.supportsElectricity();
            home.hasSecurity();


            Home skyscraper1 = new Skyscraper();
            skyscraper1.provideShelter();
            skyscraper1.hasFloors();
            skyscraper1.hasWindows();
            skyscraper1.supportsElectricity();
            skyscraper1.hasSecurity();


            Skyscraper skyscraper2 = new Skyscraper();
            skyscraper2.provideShelter();
            skyscraper2.hasFloors();
            skyscraper2.hasWindows();
            skyscraper2.supportsElectricity();
            skyscraper2.hasSecurity();
            HomeDesign designer = new HomeDesign();
            designer.design(home);
            designer.design(skyscraper1);
            designer.design(skyscraper2);

            System.out.println("\n--- 43.Library and Digital LibraryExample ---");
            Library library = new Library();
            library.addBook();
            library.issueBook();
            library.returnBook();
            library.catalog();
            library.membership();

            Library digitalLib1 = new DigitalLibrary();
            digitalLib1.addBook();
            digitalLib1.issueBook();
            digitalLib1.returnBook();
            digitalLib1.catalog();
            digitalLib1.membership();


            DigitalLibrary digitalLib2 = new DigitalLibrary();
            digitalLib2.addBook();
            digitalLib2.issueBook();
            digitalLib2.returnBook();
            digitalLib2.catalog();
            digitalLib2.membership();
            TypeOfBook type = new TypeOfBook();
            type.bookType(library);
            type.bookType(digitalLib1);
            type.bookType(digitalLib2);

            System.out.println("\n--- 44.Spacecraft and rocket Example ---");
            Spacecraft spacecraft = new Spacecraft();
            spacecraft.launch();
            spacecraft.land();
            spacecraft.orbit();
            spacecraft.communicate();
            spacecraft.collectData();

            Spacecraft rocket1 = new Rockett();
            rocket1.launch();
            rocket1.land();
            rocket1.orbit();
            rocket1.communicate();
            rocket1.collectData();

            Rockett rocket2 = new Rockett();
            rocket2.launch();
            rocket2.land();
            rocket2.orbit();
            rocket2.communicate();
            rocket2.collectData();
            Jet jetInspector = new Jet();
            jetInspector.typeOfJet(spacecraft);
            jetInspector.typeOfJet(rocket1);
            jetInspector.typeOfJet(rocket2);

            System.out.println("\n--- 45.Teacher Example ---");
            Teacher teacher = new Teacher();
            teacher.teach();
            teacher.gradePapers();
            teacher.prepareLesson();
            teacher.conductExam();
            teacher.guideStudents();


            Teacher mathTeacher1 = new MathTeacher();
            mathTeacher1.teach();
            mathTeacher1.gradePapers();
            mathTeacher1.prepareLesson();
            mathTeacher1.conductExam();
            mathTeacher1.guideStudents();


            MathTeacher mathTeacher2 = new MathTeacher();
            mathTeacher2.teach();
            mathTeacher2.gradePapers();
            mathTeacher2.prepareLesson();
            mathTeacher2.conductExam();
            mathTeacher2.guideStudents();
            ScienceTeacher handler1 = new ScienceTeacher();
            handler1.teacherName(teacher);
            handler1.teacherName(mathTeacher1);
            handler1.teacherName(mathTeacher2);

            System.out.println("\n--- 46.Food and cake Example ---");
            Food food = new Food();
            food.cook();
            food.serve();
            food.eat();
            food.digest();
            food.store();

            Food cake1 = new Cake();
            cake1.cook();
            cake1.serve();
            cake1.eat();
            cake1.digest();
            cake1.store();


            Cake cake2 = new Cake();
            cake2.cook();
            cake2.serve();
            cake2.eat();
            cake2.digest();
            cake2.store();
            Biscuit biscuitHandler = new Biscuit();
            biscuitHandler.biscuitName(food);
            biscuitHandler.biscuitName(cake1);
            biscuitHandler.biscuitName(cake2);

            System.out.println("\n--- 47.Software Example ---");
            Software software = new Software();
            software.install();
            software.execute();
            software.update();
            software.debug();
            software.uninstall();

            Software os1 = new OperatingSystem();
            os1.install();
            os1.execute();
            os1.update();
            os1.debug();
            os1.uninstall();

            OperatingSystem os2 = new OperatingSystem();
            os2.install();
            os2.execute();
            os2.update();
            os2.debug();
            os2.uninstall();
            Windows windowsHandler = new Windows();
            windowsHandler.hp(software);
            windowsHandler.hp(os1);
            windowsHandler.hp(os2);

            System.out.println("\n--- 48.Tree and oak Example ---");
            Tree tree = new Tree();
            tree.grow();
            tree.photosynthesize();
            tree.shedLeaves();
            tree.bearFruit();
            tree.provideOxygen();


            Tree oak1 = new Oak();
            oak1.grow();
            oak1.photosynthesize();
            oak1.shedLeaves();
            oak1.bearFruit();
            oak1.provideOxygen();


            Oak oak2 = new Oak();
            oak2.grow();
            oak2.photosynthesize();
            oak2.shedLeaves();
            oak2.bearFruit();
            oak2.provideOxygen();
            CoconutTree coconut = new CoconutTree();
            coconut.noOfCoconut(tree);
            coconut.noOfCoconut(oak1);
            coconut.noOfCoconut(oak2);

            System.out.println("\n--- 49.Light and lightsource Example ---");
            LightSourcee light2 = new LightSourcee();
            light2.lightColor();
            light2.lightMaterial();
            light2.lightSource();
            light2.lightType();
            light2.material();

            LightSourcee light3 = new Light();
            light3.lightColor();
            light3.lightMaterial();
            light3.lightSource();
            light3.lightType();
            light3.material();

            Light light4=new Light();
            light4.lightColor();
            light4.lightMaterial();
            light4.lightSource();
            light4.lightType();
            light4.material();
            Prism prism = new Prism();
            prism.checkLightType(light2);
            prism.checkLightType(light3);
            prism.checkLightType(light4);



            System.out.println("\n--- 50.Robot Example ---");
            Robot robot = new Robot();
            robot.powerOn();
            robot.performTask();
            robot.recharge();
            robot.communicate();
            robot.shutdown();

            Robot humanoid1 = new HumanoidRobot();
            humanoid1.powerOn();
            humanoid1.performTask();
            humanoid1.recharge();
            humanoid1.communicate();
            humanoid1.shutdown();


            HumanoidRobot humanoid2 = new HumanoidRobot();
            humanoid2.powerOn();
            humanoid2.performTask();
            humanoid2.recharge();
            humanoid2.communicate();
            humanoid2.shutdown();

            AIRobot aiBot = new AIRobot();
            aiBot.interactWithRobot(robot);
            aiBot.interactWithRobot(humanoid1);
            aiBot.interactWithRobot(humanoid2);









        }



        }








