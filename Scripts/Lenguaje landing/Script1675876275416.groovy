import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\PC-09\\Documents\\Apk Katalon\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Application_hec/android.widget.Button - Seleccionar Idioma'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/androidx.cardview.widget.CardView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/android.widget.TextView - Herzlich willkommen'), 
    'Herzlich willkommen')

Mobile.tap(findTestObject('Object Repository/Application_hec/android.widget.Button - Whlen Sie eine Sprache'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/androidx.cardview.widget.CardView (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/android.widget.TextView - Welcome'), 'Welcome')

Mobile.tap(findTestObject('Object Repository/Application_hec/android.widget.Button - Select Language'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/androidx.cardview.widget.CardView (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/android.widget.TextView - Bienvenue'), 'Bienvenue')

Mobile.tap(findTestObject('Object Repository/Application_hec/android.widget.Button - Choisir la langue'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/androidx.cardview.widget.CardView (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/android.widget.TextView - Benvenuto'), 'Benvenuto')

Mobile.tap(findTestObject('Object Repository/Application_hec/android.widget.Button - Seleziona la lingua'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/androidx.cardview.widget.CardView (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/android.widget.TextView - Bem-vindo'), 'Bem-vindo')

Mobile.tap(findTestObject('Object Repository/Application_hec/android.widget.Button - Selecione o idioma'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/androidx.cardview.widget.CardView (5)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/android.widget.TextView - Bienvenido'), 'Bienvenido')

