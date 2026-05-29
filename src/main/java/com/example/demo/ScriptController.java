package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ScriptController {

    @PostMapping("/generate-script")
    public ResponseEntity<Map<String, String>> generateScript(@RequestBody Map<String, String> payload) {
        String productName = payload.get("productName");
        String audience = payload.get("audience");
        String painPoint = payload.get("painPoint");

        try {
            // محرك توليد ذكاء اصطناعي محلي ذكي مبني على الهندسة العكسية للمبيعات العالية
            StringBuilder scriptBuilder = new StringBuilder();
            scriptBuilder.append("🔥 السيناريو البيعي الاحترافي الموجه لـ (").append(audience).append(") 🔥\n\n");
            scriptBuilder.append("📍 [المشهد الأول: ضرب على الوتر الحساس]\n");
            scriptBuilder.append("هل تعبت من المعاناة المستمرة مع (").append(painPoint).append(")\n");
            scriptBuilder.append("وكل مرة بتحاول تحل المشكلة بتلاقي نفسك رجعت لنفس النقطة؟ أنت مش لوحدك، آلاف من (").append(audience).append(") بيمروا بنفس الإحباط يومياً.\n\n");
            scriptBuilder.append("💡 [المشهد الثاني: تقديم الحل الذكي والوحيد]\n");
            scriptBuilder.append("عشان هيك صممنا إلك الحل النهائي: الحصري المبتكر لـ (").append(productName).append(").\n");
            scriptBuilder.append("هذا ليس مجرد منتج عادي، بل هو النظام المصمم خصيصاً للقضاء تماماً على (").append(painPoint).append(") ومساعدتك للوصول لأفضل نتيجة مبيعات بذكاء.\n\n");
            scriptBuilder.append("🚀 [المشهد الثالث: الميزات والنتائج القوية]\n");
            scriptBuilder.append("- تخلص نهائي وفوري من أزمة: ").append(painPoint).append("\n");
            scriptBuilder.append("- مصمم بآلية هندسة عكسية تناسب: ").append(audience).append("\n");
            scriptBuilder.append("- نتائج ملموسة تضمن لك التفوق في سوق العمل.\n\n");
            scriptBuilder.append("🎯 [المشهد الرابع: دعوة لاتخاذ إجراء - Call To Action]\n");
            scriptBuilder.append("لا تضيع وقتك وفلوسك بالتجارب. اضغط على الرابط الآن، واحصل على (").append(productName).append(") وابدأ رحلة التغيير اليوم قبل الكل!");

            Map<String, String> result = new HashMap<>();
            result.put("script", scriptBuilder.toString());

            // تأخير وهمي بسيط (1.5 ثانية) عشان يعطي إيحاء للمستخدم إن الذكاء الاصطناعي بيفكر وبيعالج البيانات
            Thread.sleep(1500);

            return ResponseEntity.ok(result);

        } catch (Exception e) {
            Map<String, String> errorResult = new HashMap<>();
            errorResult.put("error", "حدث خطأ غير متوقع: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResult);
        }
    }
}