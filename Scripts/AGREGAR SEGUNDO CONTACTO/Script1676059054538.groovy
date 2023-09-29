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

Mobile.tap(findTestObject('Object Repository/Agregar_contacto/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Agregar_contacto/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Agregar_contacto/android.widget.EditText - Busca por apodo (1)'), 0)

Mobile.setText(findTestObject('Agregar_contacto/android.widget.EditText - Busca por apodo (1)'), 'edwin_1324', 0)

Mobile.tap(findTestObject('Object Repository/Agregar_contacto/android.widget.Button - AGREGAR (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Agregar_contacto/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Agregar_contacto/android.widget.ImageButton (2)'), 0)

