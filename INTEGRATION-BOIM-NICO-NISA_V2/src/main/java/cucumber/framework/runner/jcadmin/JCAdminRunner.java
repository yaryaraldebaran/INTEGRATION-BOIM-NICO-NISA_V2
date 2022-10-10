package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/001Login001LoginValid.feature",
		"src/main/resources/jcadmin/001Login002LoginInvalid.feature",
		"src/main/resources/jcadmin/002Testimonial009SlidePageTestimonial.feature",
		"src/main/resources/jcadmin/002Testimonial008ListTestimonial.feature",
		"src/main/resources/jcadmin/002Testimonial007SearchEdit.feature",
		"src/main/resources/jcadmin/002Testimonial006SearchNegatif.feature",
		"src/main/resources/jcadmin/002Testimonial005Search.feature",
		"src/main/resources/jcadmin/002Testimonial004EditNegatif.feature",
		"src/main/resources/jcadmin/002Testimonial003Edit.feature",
		"src/main/resources/jcadmin/002Testimonial002TambahNegatif.feature",
		"src/main/resources/jcadmin/002Testimonial001Tambah.feature",
		
		
		"src/main/resources/jcadmin/003RincianBiaya001MenambahRB.feature", //pass
        "src/main/resources/jcadmin/003RincianBiaya002MengeditRB.feature", //pass
        "src/main/resources/jcadmin/003RincianBiaya003MelihatRB.feature", //pass
        "src/main/resources/jcadmin/003RincianBiaya004MencariRB.feature", //pass
        "src/main/resources/jcadmin/003RincianBiaya005MenambahRBNegatif.feature", //gagal
        "src/main/resources/jcadmin/003RincianBiaya006MencariRBNegative.feature", //pass
        "src/main/resources/jcadmin/003RincianBiaya007MengeditRBNegative.feature", //pass
        "src/main/resources/jcadmin/004Benefit001MenambahBenefit.feature", //pass
        "src/main/resources/jcadmin/004Benefit002MengeditBenefit.feature", //parsial
        "src/main/resources/jcadmin/005Blog001MenambahBlog.feature",  //pass
        "src/main/resources/jcadmin/005Blog002MengeditBlog.feature",  //pass 
        "src/main/resources/jcadmin/005Blog003PindahHalaman.feature", //pass
		
		
		"src/main/resources/jcadmin/005About001AddTrainer.feature",
		"src/main/resources/jcadmin/005About002AddTrainerNegative.feature",
		"src/main/resources/jcadmin/005About003FindAndMoveTrainer.feature",
		"src/main/resources/jcadmin/005About004FindAndMoveNegative.feature",
		"src/main/resources/jcadmin/005About005EditTrainer.feature",
		"src/main/resources/jcadmin/005About006EditTrainerNegative.feature",
		"src/main/resources/jcadmin/005About007EditInputTrainerNegative.feature",
		"src/main/resources/jcadmin/006Blog005FindAndEditBlogNegative.feature",
		"src/main/resources/jcadmin/007ContactMessages001GetMessages.feature",
		"src/main/resources/jcadmin/007ContactMessages002SearchMessages.feature",
		"src/main/resources/jcadmin/007ContactMessages003MovePage.feature",
		"src/main/resources/jcadmin/007ContactMessages004CariNegative.feature",
		"src/main/resources/jcadmin/005About008FindAndEdit.feature"
		},
glue = "cucumber.framework.runner.jcadmin",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}
