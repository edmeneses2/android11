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

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Registrar'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Elige una pregunta'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Qu queras ser de pequeo'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.setText(findTestObject('Object Repository/tutorial y preguntas/android.widget.EditText - Respuesta'), 'text', 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.setText(findTestObject('tutorial y preguntas/android.widget.EditText - Respuesta (1)'), 'text', 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.TextView - Elige una pregunta'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Cul es tu marca de ropa favorita'), 
    0)

Mobile.tap(findTestObject('tutorial y preguntas/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Elige una pregunta (1)'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.TextView - Dnde conoci a su pareja'), 0)

Mobile.setText(findTestObject('Object Repository/tutorial y preguntas/android.widget.EditText - Respuesta (2)'), 'text', 
    0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.Button - Finalizar'), 0)

Mobile.tap(findTestObject('Object Repository/tutorial y preguntas/android.widget.ImageButton (1)'), 0)

