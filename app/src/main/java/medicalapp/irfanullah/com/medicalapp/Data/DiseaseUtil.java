package medicalapp.irfanullah.com.medicalapp.Data;

import java.util.ArrayList;

import medicalapp.irfanullah.com.medicalapp.Models.DiseaseModel;

public class DiseaseUtil {

    public ArrayList<DiseaseModel> getDiseases()
    {
        ArrayList<DiseaseModel> diseaseModel = new ArrayList<>();

        DiseaseModel d1 = new DiseaseModel();

        d1.setDISEASE_ID(1);

        d1.setDISEASE_NAME("Botulism Poisoning");

        d1.setWHAT_IS_IT("Botulism is a food poisoning that is caused by a bacterium called Clostridium\n" +
                "botulinum. This bacterium produces a toxin in packaged and canned food,\n" +
                "such as canned vegetables and packaged meat products. Clostridium\n" +
                "botulinum produces that may be destroyed by heat (boiling temperatures).");

        d1.setWHERE_IS_IT_FOUND("Clostridium botulinum is worldwide and may be found in soil, sediment of\n" +
                "lakes and ponds, and in the digestive tract of fish and other animals");

        d1.setHOW_IS_THE_DISEASE_SPREAD("Botulism toxin is produced in low acid food if canned food, such as\n" +
                "vegetables, meat and fish are improperly packaged and prepared.\n" +
                "Hermetically sealed packages and canned food may become contaminated\n" +
                "with botulism bacteria if a can is damaged especially on a seam.\n" +
                "Poisoning occurs from eating contaminated food. Only a small amount of\n" +
                "contaminated food may result in illness. The disease is not be spread from\n" +
                "person to person.\n" +
                "Foods that have been associated with food borne botulism outbreaks in the\n" +
                "United States are home canned vegetables and low acid fruits, dried whole fish\n" +
                "(with intestines), sautéed onions, chopped garlic in oil and baked potatoes. ");

        d1.setSTAGES_OF_DISEASES("The incubation period ranges from 12 to 36 hours. The shorter the\n" +
                "incubation period the more severe the disease and the higher the fatality rate.\n" +
                "Once eaten the toxin causes muscle paralysis that progresses throughout the\n" +
                "body, starting from the eyes downward. The first signs and symptoms\n" +
                "exhibited are blurred or double vision, vomiting and constipation or diarrhea,\n" +
                "followed by a dry mouth, difficulty speaking and swallowing, and failure to\n" +
                "breath.\n" +
                "The fatality rate in the United States for botulism poisoning is 5% to 10%.\n" +
                "However, for those who survive, recovery is a slow process and may take\n" +
                "months");

        d1.setTREATMENT("Treatment for botulism poisoning is the use of an antitoxin, and respiratory\n" +
                "support to prevent hypoxia (oxygen deficiency). Seek care from an emergency\n" +
                "room, urgent care center or primary doctor.");

        d1.setPREVENTION("The disease can be avoided by not consuming food from damaged or bulged\n" +
                "hermetically sealed cans or packages. Backcountry operators cannot serve\n" +
                "“home” canned or hermetically packaged food to guests because home\n" +
                "processing is inconsistent and may fail to destroy all botulism spores, therefore\n" +
                "increasing the risk of botulism poisoning. Hermetically processed food for guests must be from an approved commercial source, and in good physical\n" +
                "condition. Canned or packaged low acid food, such as vegetables and meats,\n" +
                "should be boiled prior to consumption as an extra precaution in case a\n" +
                "container has physical damage that is invisible. e.\n" +
                "Other actions that may be taken include immediate chilling (do not allow the\n" +
                "food to sit at “room” temperature) of baked potatoes and other cooked\n" +
                "vegetables to 45˚F within 4 hours to prevent bacteria like botulism from\n" +
                "growing and producing their toxins. Also, opened packages and containers of\n" +
                "low acid food must be immediately placed in an ice chest at 45˚F or less to\n" +
                "prevent bacterial growth.");

        diseaseModel.add(d1);



        DiseaseModel d2 = new DiseaseModel();

        d2.setDISEASE_ID(2);

        d2.setDISEASE_NAME("Clostridium perfringens");

        d2.setWHAT_IS_IT("The bacterium grows without oxygen in potentially hazardous food and once\n" +
                "consumed infects the digestive tract and releases a toxin that results in illness");

        d2.setWHERE_IS_IT_FOUND("Clostridium perfringens is found in soil, sediment and in the digestive tracts of\n" +
                "healthy humans and other animals.");

        d2.setHOW_IS_THE_DISEASE_SPREAD("Food borne illness occurs from improper cooking practices. This bacterium\n" +
                "rapidly grows in potentially hazardous food, such as meat, meat products and\n" +
                "gravies.");

        d2.setSTAGES_OF_DISEASES("Signs and symptoms usually begin 6 to 24 hours after the food is consumed\n" +
                "and lasts for about one to two days. Typical signs and symptoms are\n" +
                "abdominal cramps, diarrhea and nausea; vomiting and fever are usually\n" +
                "absent. Death is rare in healthy people.");

        d2.setTREATMENT("In most cases treatment is not required, but when it is, fluids and electrolyte\n" +
                "replacement are given.");

        d2.setPREVENTION("The best way to prevent this food borne disease is the proper cooling and\n" +
                "reheating of potentially hazardous food, since bacterial spores survive cooking\n" +
                "temperatures. To properly cool food, hot food needs to be placed in shallow\n" +
                "containers in small quantities so the food is no greater than two inches deep.\n" +
                "Hot food must be placed in a cooler immediately so it will cool to 45˚F within 4 hours. However, on a backcountry trip cooling food may not be possible,\n" +
                "and should be avoided (dispose leftover food).\n" +
                "Additional preventive steps in proper food practices are to rapidly reheat food\n" +
                "to 165˚F before it is served hot and do not hold food in a cooler at 45˚F for\n" +
                "longer than 4 days. The latter precaution is necessary because bacteria can\n" +
                "grow and multiply at 45˚F, and after four days bacterial numbers may be great\n" +
                "enough to cause a food borne outbreak.");

        diseaseModel.add(d2);


        //3


        DiseaseModel d3 = new DiseaseModel();

        d3.setDISEASE_ID(3);

        d3.setDISEASE_NAME("Campylobacteriosis");

        d3.setWHAT_IS_IT("This is an acute zoonotic disease caused by a curved-shaped rod bacterium.\n" +
                "This disease-causing bacterium both infects and produces a toxin in the\n" +
                "digestive tract. It is believed that this toxin causes diarrhea. This disease is the\n" +
                "leading cause of diarrhea in the United States, resulting in 4 to 6 million cases\n" +
                "each year. ");

        d3.setWHERE_IS_IT_FOUND("Animals that commonly carry this disease include healthy cattle, chickens,\n" +
                "birds, puppies, kittens, swine, sheep, rodents and flies. While most of these\n" +
                "animals carry the organism in their digestive tracts, flies carry microorganisms\n" +
                "externally on their bodies. A fly can spread the disease by picking up microbial\n" +
                "“hitch hikers”, on their legs and mouth-parts and deposit these organisms by\n" +
                "landing or walking on food and water. The other animals carry this bacteria\n" +
                "in their digestive tracts. Other sources of this disease include untreated\n" +
                "drinking water, such as water from springs, streams, rivers and lakes, and raw\n" +
                "dairy products.");

        d3.setHOW_IS_THE_DISEASE_SPREAD("This disease may be spread from animal to human or from human to human.\n" +
                "The disease may also be spread from human or animal fecal contamination of\n" +
                "food and water, or from consuming improperly cooked poultry products.\n" +
                "Campylobacter jejuni occurs everywhere in the world. In fact, this bacterium is\n" +
                "the cause of 5% to 14% diarrhea worldwide, especially in children 2 years and\n" +
                "younger. \n");

        d3.setSTAGES_OF_DISEASES("The incubation period for this disease is 2 to 5 days, and lasts anywhere from\n" +
                "2 to 10 days. Typical symptoms include watery or sticky diarrhea (which can\n" +
                "contain blood), fever, abdominal pain, nausea, headache and muscle pain.\n" +
                "The period of communicability (when the disease may be spread from feces is the entire duration of the disease, but some infections may have no\n" +
                "symptoms. Complications and relapses of this disease are infrequent, and the\n" +
                "fatality rate is one in a 1000.");

        d3.setTREATMENT("Antibiotic treatment is usually not necessary and most individuals are treated\n" +
                "with fluids and replacement of lost electrolytes.");

        d3.setPREVENTION("It is thought that most of the illnesses are caused by eating undercooked\n" +
                "poultry. Surveys indicate that 20% to 100% of commercial chickens are\n" +
                "contaminated with Campylobacter. To prevent this disease, all poultry must be\n" +
                "cooked throughout to at least 165˚F for 15 seconds to kill this bacterium. It\n" +
                "is equally important to sanitize all food contact surfaces after preparation of\n" +
                "poultry to prevent cross-contamination to other food.\n" +
                "Good hygienic practices prevent the spread of diseases, such as Campylobacter.\n" +
                "After handling poultry and poultry products, hands need to be lathered with\n" +
                "soap and washed for 20 seconds in 110˚F water to remove gross debris and\n" +
                "microorganisms");

        diseaseModel.add(d3);

        //4

        DiseaseModel d4 = new DiseaseModel();

        d4.setDISEASE_ID(4);

        d4.setDISEASE_NAME("Cholera");

        d4.setWHAT_IS_IT("The disease Cholera is a bacterium called Vibrio cholerae. Cholera is caused by\n" +
                "several different bacterial groups, some cause more severe disease than others.\n" +
                "All groups that cause this disease produce a toxin in the digestive tract. It takes\n" +
                "about one million bacterial cells to cause disease in an individua");

        d4.setWHERE_IS_IT_FOUND("Humans are the primary reservoir for this disease; however, “environmental”\n" +
                "reservoirs have been identified in association with marine crustaceans\n" +
                "including lobsters, shrimps, crabs and barnacles. In the United States, the\n" +
                "Gulf of Mexico coast has been identified as an environmental reservoir for this\n" +
                "organism.");

        d4.setHOW_IS_THE_DISEASE_SPREAD("Transmission is through eating of food or drinking contaminated water with\n" +
                "feces or vomitus. While the last outbreaks of Cholera occurred in the United\n" +
                "States around 1911, there has been a steady increase of isolated cases in the\n" +
                "nation that has been attributed to worldwide travel. Most of these cases have\n" +
                "involved bottled water, ice, ice cream, cooked rice, produce and raw or\n" +
                "undercooked seafood from polluted waters");

        d4.setSTAGES_OF_DISEASES("Symptoms usually appear within 2 to 3 days after eating or drinking\n" +
                "contaminated food or water. This disease is identified by sudden onset of\n" +
                "profuse painless, watery diarrhea (“rice water” stools), nausea and vomiting.\n" +
                "This rapid onset of painless watery diarrhea results in rapid dehydration,\n" +
                "which may lead to renal failure in severe, untreated cases. The fatality rate for\n" +
                "this disease may exceed 50% if the severe disease goes untreated, and is less\n" +
                "than 1% if individuals receive proper treatment immediately.\n" +
                "Individuals are contagious when they have signs and symptoms, but some\n" +
                "individuals may remain contagious several months after they recover.\n" +
                "Someone who appears healthy may be shedding cholera organisms from their\n" +
                "feces, which can be transmitted to other people through food or water if this\n" +
                "person does not practice good hygienic practices. ");

        d4.setTREATMENT("The treatment of Cholera is aggressive fluid and electrolyte replacement and\n" +
                "treatment of secondary complications from the disease. Anti-microbial\n" +
                "treatment is also used by doctors as a supplemental treatment to reduce the\n" +
                "numbers of bacteria in the digestive tract, and to shorten the period of\n" +
                "communicability.");

        d4.setPREVENTION("The best prevention is to obtain water from approved sources or properly treat\n" +
                "any surface water so the bacteria are effectively removed. Cholera is primarily\n" +
                "associated with poor sanitation, where human sewage contaminates drinking\n" +
                "waters and coastal waters. Seafood such as fish and shellfish is also a source,\n" +
                "especially if the seafood is eaten raw or undercooked. All seafood served by\n" +
                "commercial operators must be obtained from an approved sources, and the\n" +
                "Shucker-Packer Interstate Certificate Number must be obtained and kept for\n" +
                "at least 90 days for all shellfish. However, “High Risk” individuals may not be\n" +
                "served undercooked seafood because of the increased risk of infection and\n" +
                "complications. Raw or undercooked seafood cannot be served to “High Risk”\n" +
                "customers. However, if guests are not designated as “High Risk”, then raw or\n" +
                "undercooked seafood may be prepared and served to them as long as they have\n" +
                "been advised of the hazards (Consumer advisory requirements are discussed in\n" +
                "the Food Section of this workbook).");

        diseaseModel.add(d4);

        //5

        DiseaseModel d5 = new DiseaseModel();

        d5.setDISEASE_ID(5);

        d5.setDISEASE_NAME("Vibrio parahaemolyticus");

        d5.setWHAT_IS_IT("This bacterium causes disease that is less severe than Vibrio cholerae. The\n" +
                "disease is self-limiting that in that symptoms usually are mild in healthy individuals. It produces a toxin in the digestive tract similar to Cholera. The\n" +
                "infective dose is more than a million bacterial cells.");

        d5.setWHERE_IS_IT_FOUND("Like Cholera, this bacterium is also found in marine coastal environments (in\n" +
                "the water during warmer months and in the sediment during colder months).");

        d5.setHOW_IS_THE_DISEASE_SPREAD("This organism is more widespread in the United States than Cholera, and\n" +
                "outbreaks involve raw or undercooked seafood.");

        d5.setSTAGES_OF_DISEASES("Within 12 to 24 hours after consumption of contaminated food or water,\n" +
                "symptoms begin with watery diarrhea, abdominal cramps, and sometimes\n" +
                "nausea, vomiting, fever and headache. Occasionally, symptoms include\n" +
                "bloody or mucoid stools, high fever and high white blood cell count.\n" +
                "The disease is usually very self-limiting and recovery occurs within one to\n" +
                "seven days, and death rarely occurs.\n" +
                "Unlike Cholera, this disease is not communicable (not spread from person to\n" +
                "person).");

        d5.setTREATMENT("If treatment is required, it includes fluids and electrolyte replacement.");

        d5.setPREVENTION("Properly store and cook marine fish and shellfish. Seafood must be stored cold\n" +
                "at 45˚F or less and cooked thoroughly to 145˚F or greater for 15 seconds if\n" +
                "the seafood is whole and intact. However, if the seafood is ground it must be\n" +
                "cooked to 155˚F or greater for 15 seconds, and if the seafood is stuffed it must\n" +
                "be cooked to 165˚F or greater for 15 seconds.\n" +
                "Care must be taken to prevent cross-contamination when handling raw\n" +
                "seafood. Do not store raw seafood immediately over or next to ready-to-eat\n" +
                "food (food that is not heated after handling), wash and sanitize all surfaces\n" +
                "after preparing raw seafood and thoroughly wash hands after preparation.\n" +
                "Please remember if shellfish is brought on a backcountry trip that the\n" +
                "Shucker-Packer Interstate Certificate Number (SPICN) must be kept for at\n" +
                "least 90 days after shellfish are purchased. This number indicates where and\n" +
                "when shellfish were harvested, which critical information especially if there is\n" +
                "an outbreak from shellfish. \n Raw or undercooked seafood cannot be served to “High Risk” customers.\n" +
                "However, if guests are not designated as “High Risk”, then raw or\n" +
                "undercooked seafood may be prepared and served to them as long as they have\n" +
                "been advised of the hazards (Consumer advisory requirements are discussed in\n" +
                "the Food Section of this workbook).");

        diseaseModel.add(d5);


        //6
        DiseaseModel d6 = new DiseaseModel();

        d6.setDISEASE_ID(6);

        d6.setDISEASE_NAME("“E. coli” 0157:H7");

        d6.setWHAT_IS_IT("The disease is caused by Escherichia coli 0157:H7. Bacteria produce toxins in\n" +
                "the digestive tract called. Production of the toxins depends on the presence of\n" +
                "certain phage, which are carried by the bacteria. It takes anywhere from 10 to\n" +
                "15 bacterial cells to cause disease in an individual.");

        d6.setWHERE_IS_IT_FOUND("Cattle are the most likely host, but sheep and humans may carry the disease\n" +
                "as well. In addition, there is increasing evidence that North American deer\n" +
                "may also carry the disease.");

        d6.setHOW_IS_THE_DISEASE_SPREAD("Disease occurs primarily from ingestion of undercooked beef patties,\n" +
                "unpasteurized milk, unpasteurized apple cider, contaminated alfalfa sprouts and\n" +
                "person to person transmission. Cases have been reported from contaminated\n" +
                "drinking water sources and from swimming in a contaminated lake.");

        d6.setSTAGES_OF_DISEASES("The incubation period range is from 2 to 8 days, and infected individuals are\n" +
                "contagious for one week or less however. However, one third of children may\n" +
                "remain communicable for up to 3 weeks. The signs and symptoms of the\n" +
                "disease include severe abdominal cramps, diarrhea (which is initially watery\n" +
                "but becomes grossly bloody) and occasionally vomiting. Fever is either lowgrade\n" +
                "or absent.\n" +
                "The disease may be mild with recovery in about 8 days. However, up to 7%\n" +
                "of all cases can become more severe.");

        d6.setTREATMENT("Treatment is mainly fluid and electrolyte replacement");

        d6.setPREVENTION("The primary foods of concern are ground beef, unpasteurized milk and juice\n" +
                "and alfalfa sprouts. To prevent illness from ground meat, all ground meat such\n" +
                "as beef must be cooked throughout to 155˚F or greater for 15 seconds. Care must also be taken to prevent cross-contamination during preparation, storage\n" +
                "and transportation.\n" +
                "Only pasteurized dairy products and juice may be served to backcountry\n" +
                "guests, and alfalfa sprouts must be thoroughly washed to remove debris and\n" +
                "microbes.\n" +
                "If undercooked ground meat is prepared and served to guests, then they must\n" +
                "be advised of the potential hazards, as outlined in the Consumer Advisory\n" +
                "portion of the Food Section. However, if a backcountry group is a “high risk”\n" +
                "group, then an operator may not serve them undercooked ground meat,\n" +
                "alfalfa sprouts or unpasteurized juice or milk.");

        diseaseModel.add(d6);

        //7


        DiseaseModel d7 = new DiseaseModel();

        d7.setDISEASE_ID(7);

        d7.setDISEASE_NAME("Shigellosis");

        d7.setWHAT_IS_IT("There are four different species of Shigella that cause the disease named\n" +
                "Shigellosis. Shigella bacteria infect the digestive tract of mainly humans, and\n" +
                "in some infections produce a toxin that may damage the intestinal lining.");

        d7.setWHERE_IS_IT_FOUND("Humans are the primary source of Shigella, with monkeys occasionally acting\n" +
                "as carriers.");

        d7.setHOW_IS_THE_DISEASE_SPREAD("Primary transmission is the fecal/oral route. Most cases are due to poor\n" +
                "hygienic practices, especially the lack of or poor hand washing methods, and\n" +
                "water contaminated with human feces.\n" +
                "This disease is responsible for about 600,000 deaths per year worldwide. Most\n" +
                "of the deaths involve children 10 years or younger. In the United States\n" +
                "Shigellosis accounts for up to 300,000 diarrheal cases per year, and the fatality\n" +
                "rate is a function of the health of an individual. The fatality rate can be as high\n" +
                "as 20% among high risk groups, such as hospitalized patients. ");

        d7.setSTAGES_OF_DISEASES("The signs and symptoms of the disease begin anywhere from 12 to 96 hours\n" +
                "after consuming as few as 10 to 100 bacterial cells. The symptoms include\n" +
                "fever, nausea, vomiting, abdominal cramps and watery or bloody diarrhea.\n" +
                "The disease is usually self-limiting for healthy individuals and recovery occurs\n" +
                "anywhere from 4 to 7 days. \n Individuals may be contagious up to 4 weeks after symptoms end.");

        d7.setTREATMENT("For most cases, only fluid and electrolyte replacement is needed. However, for\n" +
                "high risk individuals anti-microbial treatment may be prescribed by a\n" +
                "physician.");

        d7.setPREVENTION("To prevent the spread of diseases such as Shigellosis, great care must be taken\n" +
                "to wash hands. The following hand washing procedure must be used before\n" +
                "preparing food, before purifying water, after toilet duty, or after handling\n" +
                "waste:\n" +
                "• Wash exposed hands, wrists and arms for 20 seconds in\n" +
                "• Warm water (110˚F) with\n" +
                "• Soap all exposed areas to a lather, then\n" +
                "• Rinse soap off and\n" +
                "• Air dry or dry with a paper towel\n" +
                "It is also important to treat all untreated water by following the steps outlined\n" +
                "in the water Purification Section of this manual.");

        diseaseModel.add(d7);


        //8

        DiseaseModel d8 = new DiseaseModel();

        d8.setDISEASE_ID(8);

        d8.setDISEASE_NAME("Salmonellosis");

        d8.setWHAT_IS_IT("These disease agents cause the disease known as Salmonellosis. There are more\n" +
                "than 2,000 different types of Salmonella. There is evidence that these bacteria\n" +
                "produce a toxin when embedded in the intestinal tract that may contribute to\n" +
                "symptoms.");

        d8.setWHERE_IS_IT_FOUND("Animals that are common carriers of the disease include poultry and swine,\n" +
                "but also may include cattle, rodents, iguanas, turtles, tortoises, terrapins, dogs,\n" +
                "cats and humans");

        d8.setHOW_IS_THE_DISEASE_SPREAD("The majority of the cases result from contaminated food and water, improperly\n" +
                "cooked poultry and poultry products, improperly cooked eggs and egg\n" +
                "products, improperly pasteurized milk and milk products, improperly sanitized\n" +
                "kitchen surfaces and fecal/oral transmission due to improper hand washing.");

        d8.setSTAGES_OF_DISEASES("Symptoms usually occur with sudden onset of headache, fever, abdominal\n" +
                "cramps, diarrhea, nausea and sometimes vomiting. Moat infections with this organism result in inflammation of the intestines, but in some cases the\n" +
                "infection may develop into septicemia (infection of the blood) or localize in a\n" +
                "body tissue. Deaths with this disease are uncommon, however, death may be\n" +
                "more frequent with high risk groups, such as young children, the elderly, or\n" +
                "high risk individuals.\n" +
                "Infected individuals are communicable throughout the acute phases of the\n" +
                "disease. However, some may develop into a “carrier” state where no signs and\n" +
                "symptoms are exhibited, but the organism still is present for several months,\n" +
                "but in rare cases it may last up to a year or longer.");

        d8.setTREATMENT("Most cases only require fluid and electrolyte replacement, but antibiotic\n" +
                "treatment may be prescribed by physicians for high-risk individuals.");

        d8.setPREVENTION("To prevent disease:\n" +
                "• Wash hands thoroughly before handling or preparing food using the hand\n" +
                "washing procedures found in the Food Section of this manual,\n" +
                "• Sanitize kitchen surfaces,\n" +
                "• Store raw poultry or poultry products away from other food,\n" +
                "• Cook eggs and egg products to 145˚F for 15 seconds,\n" +
                "• Cook poultry and poultry products to 165˚F for 15 seconds,\n" +
                "• Use pasteurized milk and milk products and\n" +
                "• Store potentially hazardous food cold at 45˚F or less.\n" +
                "Insects such as flies may also be a source of disease by mechanically\n" +
                "transporting disease-causing organisms from feces to food and water.\n" +
                "Therefore, toilet facilities must be properly covered when they are not being\n" +
                "used to keep flies from accessing waste");

        diseaseModel.add(d8);


        //9

        DiseaseModel d9 = new DiseaseModel();

        d9.setDISEASE_ID(9);

        d9.setDISEASE_NAME("Staph Food Poisoning");

        d9.setWHAT_IS_IT("Staph food poisoning is caused by a round-shaped bacterium known as\n" +
                "Staphylococcus aureus. These bacteria produce a toxin as they eat and grow in\n" +
                "potentially hazardous food that cannot be destroyed by cooking temperatures.\n" +
                "It is this toxin that causes the symptoms of the illness. ");

        d9.setWHERE_IS_IT_FOUND("Twenty five percent of the population carries this bacterium in the nose and\n" +
                "throat, on hair and on skin of the face and hands. Dairy cattle (especially with\n" +
                "infected udders), dogs and fowl also may serve as hosts for this microbe.");

        d9.setHOW_IS_THE_DISEASE_SPREAD("A human carrier introduces the organism to food, and if the food is held at\n" +
                "improper temperatures, bacteria produce the heat stable toxin. The toxin\n" +
                "cannot be detected in food by smell, taste or sight. Fortunately, this disease\n" +
                "cannot be transmitted from human to human.\n" +
                "Foods that this organism commonly grows on include sandwiches,\n" +
                "lunchmeat, salami, cooked ham, salad dressings, pastries and custards.");

        d9.setSTAGES_OF_DISEASES("The incubation period ranges from 30 minutes to 8 hours. Food poisoning\n" +
                "caused by this organism is characterized by abrupt onset with severe nausea,\n" +
                "cramps, vomiting and diarrhea. The intoxication lasts anywhere from one to\n" +
                "two days, and deaths are rare.");

        d9.setTREATMENT("Patients are treated with fluids and electrolyte replacement.");

        d9.setPREVENTION("Education of food handlers is a primary prevention for this disease. Food\n" +
                "handlers must follow:\n" +
                "• A strict hand washing regime as described in the Food section of this manual,\n" +
                "• Avoid bare hand contact with ready-to-eat foods, such as lunchmeat, salad\n" +
                "dressings, custards and cream-filled pastries,\n" +
                "• Hold potentially hazardous food at proper cold temperatures of 45˚F or less\n" +
                "and\n" +
                "• Properly chill hot food to 45˚F within 4 hours (However, the use of leftovers\n" +
                "by backcountry operators is not recommended because of the increased risk\n" +
                "of Staph Food Poisoning).\n" +
                "Also, food servers with lesions on their hands, wrists, upper arms, or face need\n" +
                "to be restricted and/or excluded from preparing food. It is very important that\n" +
                "food handlers wear disposable gloves or use utensils when preparing ready-toeat\n" +
                "foods.");

        diseaseModel.add(d9);

        //10

        DiseaseModel d10 = new DiseaseModel();

        d10.setDISEASE_ID(10);

        d10.setDISEASE_NAME("Hepatitis A");

        d10.setWHAT_IS_IT("Hepatitis A causes the disease known as Infectious Hepatitis, which is\n" +
                "transmitted by the fecal/oral route, that infects the liver. ");

        d10.setWHERE_IS_IT_FOUND("Humans are the primary source of Infectious Hepatitis, with chimpanzees\n" +
                "acting as a source in rare instances");

        d10.setHOW_IS_THE_DISEASE_SPREAD("Transmission is through the fecal/oral route and contamination of food and\n" +
                "water. This is why poor sanitation and over crowded conditions may lead to\n" +
                "outbreaks of this disease. Other practices commonly associated with this\n" +
                "disease are poor hygienic practices, improper food handling and poor diaper\n" +
                "changing practices at day care facilities.\n" +
                "Hepatitis A occurs worldwide, with about 22,700 cases are reported annually\n" +
                "in the United States. ");

        d10.setSTAGES_OF_DISEASES("After an incubation period ranging from 15 to 50 days, onset is usually\n" +
                "abrupt, with fever, overall discomfort, loss of appetite, nausea, and abdominal\n" +
                "discomfort followed by jaundice (skin turns a yellow color). Only 10 to 100\n" +
                "viral particles are required to cause disease in a person. Most cases resolve\n" +
                "within 1 to 2 weeks; however, about 15% of cases can take months to recover.\n" +
                "There are a few cases where Hepatitis A may relapse for up to a year. Rarely\n" +
                "do people die from this disease, but for high-risk individuals it may be fatal.\n" +
                "People are highly contagious one to two weeks before onset of symptoms and\n" +
                "may continue to shed the virus in their feces up to one week after jaundice. \n");

        d10.setTREATMENT("Contacts must receive immunization with immunoglobulin within 2 weeks\n" +
                "by a physician. However, after symptoms begin there is no specific treatment,\n" +
                "just support care. \n Hepatitis A vaccine (2 doses) is recommended for persons at high risk for\n" +
                "contracting hepatitis A virus, such as children who live in areas that have a\n" +
                "high incidence, or individuals who work around human feces.");

        d10.setPREVENTION("Good sanitation practices are crucial for prevention as well as education for\n" +
                "food handlers. It also is essential to:\n" +
                "• Properly treat raw water sources prior to consumption;\n" +
                "• Take care during toilet handling, transportation and clean up;\n" +
                "• Employ proper hand wash procedures as described in the Food section of\n" +
                "this manual;\n" +
                "• Cook shellfish to 145˚F for 15 minutes and retain the Shucker-Packer\n" +
                "Interstate certificate number from the shellfish case for 90 days (However, if\n" +
                "raw or undercooked shellfish is served to guests, then backcountry operators\n" +
                "must provide a consumer advisory. If the backcountry operator is catering for\n" +
                "an identified “high” risk group or individual, then raw or undercooked\n" +
                "shellfish may not be served.)");

        diseaseModel.add(d10);


        //11

        DiseaseModel d11 = new DiseaseModel();

        d11.setDISEASE_ID(11);

        d11.setDISEASE_NAME("Norwalk Virus");

        d11.setWHAT_IS_IT("Norwalk-like Virus infects digestive tracts of humans.");

        d11.setWHERE_IS_IT_FOUND("Humans constitute the only known carrier for this disease");

        d11.setHOW_IS_THE_DISEASE_SPREAD("This disease has been identified as the most common cause of non-bacterial\n" +
                "gastroenteritis outbreaks in the United States. In the United States most\n" +
                "outbreaks are linked to the consumption of raw or undercooked shellfish.\n" +
                "Other outbreaks have been associated with fecal contamination of food,\n" +
                "drinking water, and recreational water. The disease is transmitted by the\n" +
                "fecal/oral route, and it is believed that human to human transmission may\n" +
                "occur. The period of communicability occurs during the acute stage of the\n" +
                "disease and may last up to 48 hours after diarrhea ends.");

        d11.setSTAGES_OF_DISEASES("This is considered a self-limiting, mild disease that begins after 10 to 50 hours\n" +
                "with nausea, vomiting, diarrhea, abdominal pain, muscle aches, headache,\n" +
                "overall discomfort and a low grade fever. The symptoms usually last 24 to 48\n" +
                "hours and death from this disease is rare. ");

        d11.setTREATMENT("There is no specific treatment prescribed for this disease, just supportive care\n" +
                "that includes fluid and electrolyte replacement.");

        d11.setPREVENTION("Prevention guidelines are the same as for Hepatitis A, and they include:\n" +
                "• Good hand wash practices during food preparation, which can be found in\n" +
                "the Food Section of this manual;\n" +
                "• Proper handling of toilet waste;\n" +
                "• Adequate cooking of shellfish to 145˚F for 15 seconds (If shellfish is served\n" +
                "undercooked or raw then a consumer advisory must be given to guests,\n" +
                "however, if guests are “high” risk then all shellfish must be adequately cooked);\n" +
                "• Proper treatment of drinking water;\n" +
                "• Proper sanitizing of kitchen and equipment surfaces; and\n" +
                "• Proper storage of raw shellfish to prevent cross-contamination to other food");

        diseaseModel.add(d11);

        //12

        DiseaseModel d12 = new DiseaseModel();

        d12.setDISEASE_ID(12);

        d12.setDISEASE_NAME("Amoebic Encephalitis");

        d12.setWHAT_IS_IT("There are several amoebas that can invade the brain. They reach the brain by\n" +
                "first entering the nose and then moving up into the brain.");

        d12.setWHERE_IS_IT_FOUND("These amoebas live in both soil and fresh water.");

        d12.setHOW_IS_THE_DISEASE_SPREAD("These amoebas are found all over the world. They commonly are found in\n" +
                "stagnant water, lakes, ponds, hot tubs, spas, natural hot-springs, effluent from wastewater treatment plants and poorly maintained swimming pool water.\n" +
                "Disease normally occurs during warmer months and may infect healthy\n" +
                "individuals that swim in infected waters. The likelihood of infection is\n" +
                "increased if water is forced through the nose by diving or swimming\n" +
                "underwater.");

        d12.setSTAGES_OF_DISEASES("The incubation period for this disease can be 3 to 7 days, or much longer in\n" +
                "some cases. Symptoms include sore throat, severe frontal headache, occasional\n" +
                "hallucinations, nausea, vomiting, high fever followed by death within 10 days. ");

        d12.setTREATMENT("Although recoveries rarely are documented, there are several prescription\n" +
                "drugs that may be used to treat these infections. ");

        d12.setPREVENTION("While visiting the backcountry, avoid swimming or diving in stagnant water,\n" +
                "ponds, natural hot-springs, water contaminated with effluent, or lakes where\n" +
                "these amoebas have been identified.");

        diseaseModel.add(d12);

        //13

        DiseaseModel d13 = new DiseaseModel();

        d13.setDISEASE_ID(13);

        d13.setDISEASE_NAME("Galloping Amoeba");

        d13.setWHAT_IS_IT("The disease is caused by an amoeba called Entamoeba histolytica. This parasite\n" +
                "has two forms, cysts that are the infective form and a non-cyst form. Infection\n" +
                "begins after a cyst found in contaminated water or food is swallowed. Once\n" +
                "swallowed, the parasites may secret toxins into the stomach lining that cause\n" +
                "signs and symptoms.");

        d13.setWHERE_IS_IT_FOUND("Humans are the hosts for this disease-causing agent.");

        d13.setHOW_IS_THE_DISEASE_SPREAD("This amoeba is found everywhere in the environment, and is transmitted by\n" +
                "the fecal/oral route. The disease may be transmitted through contaminated\n" +
                "food and water. Amoeba cysts are very resistant to normal concentrations of\n" +
                "chlorine that is used for water treatment.\n" +
                "There is a higher prevalence of Amoebiasis in areas with poor sanitation, and\n" +
                "there is a higher incidence of this disease in young adults.");

        d13.setSTAGES_OF_DISEASES("If symptoms are present, they may include abdominal discomfort, bloody or\n" +
                "mucoid diarrhea, fever, and chills. Symptoms mainly are dependent on an\n" +
                "individual’s health. Unhealthy individuals will have less resistance to this\n" +
                "disease than someone who is healthy. In most cases the disease is self-limiting.\n" +
                "Without treatment the disease and symptoms may last for years, and the\n" +
                "infected individual will remain contagious during this time.\n" +
                "It only takes one cyst to become infected and the incubation period is\n" +
                "commonly 2 to 4 weeks before symptoms appear.");

        d13.setTREATMENT("Acute Amoebiasis should be treated by a physician.");

        d13.setPREVENTION("To prevent the spread of this disease, the following guidelines must be\n" +
                "followed:\n" +
                "• Provide sanitary disposal of human feces and prevent exposure to feces\n" +
                "during toilet set up, removal and disposal.\n" +
                "• Provide proper hand wash set up and employ proper hand wash procedures\n" +
                "(as found in the Food section of this manual) before and after handling of\n" +
                "toilet facility and equipment.\n" +
                "• Prior to consumption, wash all produce thoroughly in treated water to\n" +
                "remove contaminates.\n" +
                "• Treat all “raw” water by using one of the methods provided in the water\n" +
                "purification section of this manual.");

        diseaseModel.add(d13);

        //14

        DiseaseModel d14 = new DiseaseModel();

        d14.setDISEASE_ID(14);

        d14.setDISEASE_NAME("Giardiasis");

        d14.setWHAT_IS_IT("The disease agent is a parasite that has two forms: the cyst is the infective stage\n" +
                "that is excreted in feces, and the non-cyst form is the stage that lives and\n" +
                "multiplies in the small intestine of humans. The disease may cause inadequate\n" +
                "absorption of fats and fat-soluble vitamins during the infection. The infective\n" +
                "form of Giardia is resistant to cold temperatures and normal concentrations\n" +
                "of disinfectants used to treat water. Therefore, to ensure that cysts are removed\n" +
                "from “raw” water, water must be filtered to physically remove the hardy cysts.");

        d14.setWHERE_IS_IT_FOUND("Humans, as well as other animals such as rats, mice, dogs, cats, beavers,\n" +
                "muskrats, gerbils, and mule deer may carry Giardia that may infect humans.\n" +
                "However, beavers and muskrats are the most likely source for human infections. Feces from humans and other animals increase the presence of Giardiasis in\n" +
                "the environment. This disease may occur if untreated water is consumed from\n" +
                "surface water sources like streams, lakes or rivers.");

        d14.setHOW_IS_THE_DISEASE_SPREAD("Giardia is transmitted via the fecal/oral route through water and food and the\n" +
                "disease is frequently spread from person to person as well. Giardia sometimes\n" +
                "is referred to as “travelers” disease. Large water borne outbreaks have occurred,\n" +
                "and illness has been associated with consumption of water from unfiltered\n" +
                "surface water sources or shallow wells, and during water recreational activities.\n" +
                "According to the World Health Organization, Giardiasis is the most\n" +
                "commonly reported water borne disease worldwide.\n" +
                "The disease is more prevalent in young children and infants, but anyone can\n" +
                "get the disease if they consume contaminated food or water. ");

        d14.setSTAGES_OF_DISEASES("Between 50% to 70% of infected individuals show no symptoms, but still can\n" +
                "spread the disease. However, people who have symptoms may experience\n" +
                "chronic diarrhea, abdominal cramps, bloating, excess gas, pale greasy and foul\n" +
                "smelling stools and weight loss. In severe cases the cells of the intestinal lining\n" +
                "may become damaged, but in most cases the disease is self-limiting unless\n" +
                "individuals are a health risk. Fortunately, deaths due to Giardiasis are rare.\n" +
                "It takes one or more cysts to cause infection, with an average incubation\n" +
                "period of 7 to 10 days. Duration of the disease varies from 3 to 4 days, or\n" +
                "months depending on the health of the infected individual, but most recover\n" +
                "in 1 to 4 weeks without complications. However, some cases become chronic,\n" +
                "and are characterized with recurrent, persistent brief episodes of loose foulsmelling\n" +
                "stools that can last for months without treatment. The Giardia\n" +
                "organisms may be spread throughout the entire duration of infection, with or\n" +
                "without symptoms. This is probably why the disease is widespread, since\n" +
                "many infected individuals do not realize they are infected and may easily\n" +
                "spread the disease if they do not practice good hygiene. ");

        d14.setTREATMENT("Giardiasis must be treated by a physician.");

        d14.setPREVENTION("Giardia may be present in any surface water source and, therefore, it is critical\n" +
                "that these sources be properly disinfected and filtered to remove cysts. It is\n" +
                "equally important to properly handle, transport and dispose of human feces\n" +
                "during a backcountry trip. All toilet units and equipment must be stored in tightly sealed containers and properly disinfected during a trip. Also,\n" +
                "backcountry operators must implement proper hand wash procedures (as\n" +
                "found in the Food section of this manual) during a trip to prevent the spread\n" +
                "of diseases like Giardiasis after using and handling portable toilets and\n" +
                "equipment.");

        diseaseModel.add(d14);

        //15

        DiseaseModel d15 = new DiseaseModel();

        d15.setDISEASE_ID(15);

        d15.setDISEASE_NAME("Cryptosporidiosis");

        d15.setWHAT_IS_IT("Cryptosporidium parvum, a parasite, is the primary disease-causing agent for\n" +
                "humans.\n" +
                "These parasites are extremely resistant to environmental conditions, especially\n" +
                "in cold water temperatures, and to normal concentrations of water\n" +
                "disinfectants like chlorine and iodine. Symptoms of the disease are caused by\n" +
                "the disruption of intestinal absorption and secretion by the protozoan\n" +
                "parasite.");

        d15.setWHERE_IS_IT_FOUND("Humans as well as other animals including cattle, sheep, pigs, goats, deer and\n" +
                "horses are common sources. These sources contribute to environmental\n" +
                "contamination of watersheds, foods and recreational waters");

        d15.setHOW_IS_THE_DISEASE_SPREAD("Cryptosporidium is widespread in surface waters and is common worldwide. It is\n" +
                "estimated that there are over one million cases annually throughout the world.\n" +
                "Transmission is person to person, or animal to person by the fecal/oral route.\n" +
                "However, transmission may occur when human and/or animal feces\n" +
                "contaminate food and water sources.");

        d15.setSTAGES_OF_DISEASES("An infective dose ranges from 30 to a million oocysts, depending on the\n" +
                "individual. Symptoms of the disease occur between 7 to 9 days after parasites\n" +
                "are consumed. Signs primarily include profuse watery diarrhea that resolves\n" +
                "itself in less than 30 days. However, other symptoms may include fever,\n" +
                "anorexia, nausea, abdominal cramps, vomiting, or infection of the respiratory\n" +
                "tract. Illness may persist and contribute to death in individuals that have\n" +
                "weakened immune systems. ");

        d15.setTREATMENT("Currently, there is no treatment for Cryptosporidium other than fluid and\n" +
                "electrolyte replacement. ");

        d15.setPREVENTION("Primary prevention includes:\n" +
                "• Proper handling, transportation and disposal of human feces.\n" +
                "• Proper disinfection and filtration of water sources.\n" +
                "• Good personal hygiene for backcountry operators (see hygienic practices in\n" +
                "the Food section in this manual)");

        diseaseModel.add(d15);

        //16

        DiseaseModel d16 = new DiseaseModel();

        d16.setDISEASE_ID(16);

        d16.setDISEASE_NAME("Trichinosis");

        d16.setWHAT_IS_IT("The disease is caused by a roundworm that is invisible to a human eye. The\n" +
                "infection occurs after consumption of undercooked or raw meat from a\n" +
                "particular animal, when the roundworms attach to the intestinal wall and lay\n" +
                "eggs. After the eggs hatch the larvae move from the intestine and embed in\n" +
                "muscle tissues throughout the human body");

        d16.setWHERE_IS_IT_FOUND("Common sources of Trichinosis include pigs, dogs, cats, horses, rats, bear,\n" +
                "walruses and foxes. Infection occurs when raw or undercooked meat from\n" +
                "these animals is consumed.");

        d16.setHOW_IS_THE_DISEASE_SPREAD("Trichinosis occurs worldwide, and transmission occurs if raw or undercooked\n" +
                "meat from infected animals is consumed.");

        d16.setSTAGES_OF_DISEASES("The average incubation period for the disease is from 8 to 15 days, and the\n" +
                "signs vary in humans depending upon the number of roundworms ingested.\n" +
                "The first symptoms that appear are muscle soreness, swollen upper eyelids and\n" +
                "fever, followed by orbital pain, retinal hemorrhage, photophobia, sweats,\n" +
                "chills, weakness and diarrhea. Death is due to myocardial failure, which is a\n" +
                "result of roundworms invading the heart muscle.");

        d16.setTREATMENT("Infected individuals must be treated by a physician.");

        d16.setPREVENTION("Primary prevention consists of properly cooking meat from reservoirs of this\n" +
                "disease. The proper cooking temperatures for various meats are:\n" +
                "• Whole pork muscle tissue must be cooked throughout to 130˚F or greater\n" +
                "for at least 15 seconds.\n" +
                "• Ground pork meat or other meat products must be cooked to 155˚F or\n" +
                "greater for at least 15 seconds. \n • Stuffed pork meat or other stuffed meat products must be cooked to 165˚F\n" +
                "or greater for at least 15 seconds.\n" +
                "Other preventive measures include good hygienic practices and avoidance of\n" +
                "cross-contamination. To prevent cross-contamination, raw meat, (such as\n" +
                "pork) must be stored away from or below ready-to-eat foods in ice chests or\n" +
                "other storage units, and all work surfaces thoroughly sanitized before and after\n" +
                "each use.");

        diseaseModel.add(d16);

        //17

        DiseaseModel d17 = new DiseaseModel();

        d17.setDISEASE_ID(17);

        d17.setDISEASE_NAME("Colorado Tick Fever");

        d17.setWHAT_IS_IT("The disease-causing agent is a virus. These viruses are known as arboviruses,\n" +
                "which means that the viruses reside in an insect and are transmitted when the infected insect bites an animal. This is a tickborne\n" +
                "arbovirus and is the only viral disease that\n" +
                "is known to be transmitted by ticks. \n \n Insect Vector\n\n" +
                "The vector for this disease is a tick called\n" +
                "Dermacentor andersoni. The common name for\n" +
                "this tick is the Rocky Mountain wood tick, and\n" +
                "it is generally found generally throughout the\n" +
                "western part of the United States and in\n" +
                "Canada. This tick inhabits areas with thick\n" +
                "brush and an abundance of low-lying\n" +
                "vegetation.\n" +
                "An immature tick picks up the virus from an infected animal and carries the\n" +
                "virus throughout its life; thus, passing the infective virus to any animal it\n" +
                "feeds on.");

        d17.setWHERE_IS_IT_FOUND("The primary sources for Colorado Tick Fever are Golden-Mantle squirrels,\n" +
                "chipmunks, pine squirrels, deer mice, porcupines and the Rocky Mountain\n" +
                "wood tick. ");

        d17.setHOW_IS_THE_DISEASE_SPREAD("Colorado Tick Fever is common in mountainous areas above 5,000 feet in\n" +
                "elevation in all of the Rocky Mountain States and parts of Canada.\n" +
                "Transmission is by a the bite of a tick carrying this virus. There is no evidence\n" +
                "that this disease is spread from person to person.");

        d17.setSTAGES_OF_DISEASES("In three to six days following a tick bite there is sudden onset of fever,\n" +
                "headache, pain behind the eyes, severe muscle aches and a rash may occur in\n" +
                "a small percentage of cases. The symptoms of this disease occur in two phases.\n" +
                "The first phase is the initial onset, which goes away for a brief time, followed\n" +
                "by the second phase of fever that lasts 2 to 3 days.\n" +
                "This is considered a moderately severe disease with some cases resulting in\n" +
                "encephalitis and myocarditis. However, deaths from this disease are rare.");

        d17.setTREATMENT("There is no treatment.");

        d17.setPREVENTION("The best prevent to avoid tick bites includes the following:\n" +
                "• Avoid thick, brushy areas during the summer months.\n" +
                "• Wear long sleeves and pants that hang over boots and shoes.\n" +
                "• Check pets for ticks frequently.\n" +
                "• Examine yourself frequently for ticks.\n" +
                "• If ticks are found, remove them immediately and properly. To remove a tick\n" +
                "properly, use tweezers to grasp the tick by the mouthparts as close to the skin\n" +
                "as possible. Pull the tick straight out with gentle steady pressure. Take care\n" +
                "not to squeeze or crush the body of the tick during removal. Wash the bite\n" +
                "site with soap and water. Do not use hot matches, cigarettes, fingernail\n" +
                "polish, or petroleum jelly to remove ticks as these methods are not effective.\n" +
                "It is important to save the tick (preserved in alcohol) for later identification\n" +
                "by health officials as it helps assess the risk of disease.");

        diseaseModel.add(d17);

        //18

        DiseaseModel d18 = new DiseaseModel();

        d18.setDISEASE_ID(18);

        d18.setDISEASE_NAME("Eastern Equine Encephalitis, St. Louis Encephalitis, Western Equine\n" +
                "Encephalitis and West Nile Virus");

        d18.setWHAT_IS_IT("This disease is caused by an arbovirus, which means that the virus multiplies\n" +
                "in a blood-sucking insect like a mosquito and is transmitted by a bite. In\n" +
                "nature, arboviruses alternate residence in insect hosts to animal reservoirs.  \n\n Insect Vector\n" +
                "The vectors for Eastern Equine Encephalitis (EEE), Western Equine\n" +
                "Encephalitis (WEE), St Louis Encephalitis (SLE) and West Nile Virus\n" +
                "(WNV) are mosquitoes. The disease-causing viruses are transmitted by the\n" +
                "bite from an infected mosquito.");

        d18.setWHERE_IS_IT_FOUND("Animal and insect sources for EEE, WEE, SLE and WNV may include birds,\n" +
                "rodents, bats, reptiles, amphibians, or mosquitoes. ");

        d18.setHOW_IS_THE_DISEASE_SPREAD("Transmission to humans is from a bite from an infected mosquito. This\n" +
                "disease is not spread from person to person.");

        d18.setSTAGES_OF_DISEASES("Eastern Equine Encephalitis (EEE) often causes more severe symptoms than\n" +
                "Western Equine Encephalitis (WEE) or St. Louis Encephalitis (SLE). Most\n" +
                "people exposed to these viruses have either no symptoms or mild flu-like\n" +
                "illness. A small percentage (usually less than 1%) may develop encephalitis,\n" +
                "which is characterized by a sudden onset of high fever, headache, meningeal signs, stupor, disorientation, coma, tremors, occasional convulsions and\n" +
                "spastic paralysis. Symptoms usually occur between 5 to 15 days after a\n" +
                "mosquito bite. The fatality rate for EEE may be from 0.3% to 60% depending\n" +
                "on the health and age of the person; whereas, death is uncommon for WEE.");

        d18.setTREATMENT("There is no specific treatment for either disease, only supportive treatment.");

        d18.setPREVENTION("The best prevention includes:\n" +
                "• Wearing repellents to prevent mosquito bites.\n" +
                "• Sleeping in a protected area, such as a tent that is properly screened.");

        diseaseModel.add(d18);

        //19

        DiseaseModel d19 = new DiseaseModel();

        d19.setDISEASE_ID(19);

        d19.setDISEASE_NAME("Hantavirus Pulmonary Syndrome");

        d19.setWHAT_IS_IT("The disease-causing agent is a virus called Hantavirus. Hantavirus Pulmonary\n" +
                "Syndrome was first recognized in 1993 in the Four Corners area of the\n" +
                "southwestern part of the United States. The strain of Hantavirus found in the\n" +
                "United States is called Sin Nombre Virus, which means virus with no name");

        d19.setWHERE_IS_IT_FOUND("The primary source for Hantavirus Pulmonary Syndrome (HPS) is the deer\n" +
                "mouse, also known the Black-footed deer mouse. However, other species of\n" +
                "mice (Peromyscus maniculatis), such as the cactus, pinyon and brush mice have\n" +
                "been identified as sources for HPS as well. This disease has no known insect\n" +
                "vectors.");

        d19.setHOW_IS_THE_DISEASE_SPREAD("The disease is transmitted through aerosolization and inhalation of urine,\n" +
                "droppings, or salvia from infected mice. Transmission most commonly occurs\n" +
                "when cleaning mouse droppings or nests in\n" +
                "enclosed areas. The risk is considered to be\n" +
                "much lower in open air situations. Avoid\n" +
                "sleeping on the ground where there is\n" +
                "considerable rodent activity. This disease is not\n" +
                "spread from person to person.");

        d19.setSTAGES_OF_DISEASES("The first symptoms may appear in a few days to\n" +
                "6 weeks (usually 2 weeks) after inhalation of\n" +
                "aerosolized infected mouse urine, droppings, or\n" +
                "saliva. The symptoms are flu-like and include fever, muscle aches, dry-nonproductive coughing, vomiting and abdominal\n" +
                "pain (It is interesting to note that the symptoms do not include nasal\n" +
                "stuffiness or sore throat). These first symptoms may last 2 to 15 days and are\n" +
                "followed by respiratory arrest, which is caused by fluid filling the lungs\n" +
                "making it impossible to breath. Death is due to respiratory failure and cardiac\n" +
                "shock. The fatality rate is 40% to 50%.");

        d19.setTREATMENT("There is no specific treatment for HPS, only supportive care.");

        d19.setPREVENTION("Precautions taken to reduce exposure to this disease during a backcountry trip\n" +
                "include:\n" +
                "1. Do not camp next to rodent burrows or nests.\n" +
                "2. Protect food from rodents during a camping trip by storing food in rodentproof\n" +
                "containers.\n" +
                "3. Store garbage in rodent-proof containers during a backcountry trip.\n" +
                "4. Avoid sleeping on the ground to prevent exposure to rodents and their\n" +
                "body fluids. If possible, sleep in an enclosure, such as a tent or car, or on a\n" +
                "cot off the ground.\n" +
                "5. Avoid camping in a cabin that has evidence of a rodent infestation\n" +
                "(presence of droppings and/or nests) unless the cabin is properly cleaned.\n" +
                "6. Proper cleaning of enclosed areas such as a cabin, may include the\n" +
                "following:\n" +
                "• First open all doors and windows to ventilate the enclosed area.\n" +
                "• Use a disinfectant that destroys viruses, such as household bleach (one\n" +
                "part bleach per 9 parts water) on all affected areas.\n" +
                "• Allow a disinfectant to soak and treat the area for at least 30 minutes.\n" +
                "• Use gloves and paper towels to “wet” clean the affected areas – NEVER\n" +
                "DRY CLEAN! By dry cleaning a rodent infested area, viruses may\n" +
                "become aerosolized and inhaled.\n" +
                "• Dispose contaminated cleaning materials in a garbage bag, tie bag and\n" +
                "properly dispose.");

        diseaseModel.add(d19);

        //20

        DiseaseModel d20 = new DiseaseModel();

        d20.setDISEASE_ID(20);

        d20.setDISEASE_NAME("Lyme Disease");

        d20.setWHAT_IS_IT("The disease-causing agent is a bacterium called a spirochete because of its\n" +
                "spiral-shape. \n\n Insect Vector\n" +
                "Lyme disease is transmitted by a bite from a tick. This tick is commonly\n" +
                "known as a blacklegged deer tick.");

        d20.setWHERE_IS_IT_FOUND("The primary sources are the blacklegged deer tick and white-footed mice");

        d20.setHOW_IS_THE_DISEASE_SPREAD("This disease is common in the United States along the Atlantic coast between\n" +
                "Maryland and Massachusetts, and including Wisconsin and Minnesota as well\n" +
                "as some areas of California and Oregon.\n" +
                "The disease is transmitted by a bite from an infected tick, and there is\n" +
                "evidence indicating that a tick must be attached for 24 hours or longer to\n" +
                "transmit the bacterial infection to the animal host.");

        d20.setSTAGES_OF_DISEASES("Early symptoms occur after an incubation period of 3 to 32 days and include\n" +
                "overall discomfort, fatigue, fever, headache, stiff neck, muscle pain and\n" +
                "migratory joint pains. However, the most characteristic symptom is a distinctive\n" +
                "skin lesion around the tick bite called “erythema migrans”, which has a red spot\n" +
                "or patch with a center clearing. After the initial symptoms, other symptoms\n" +
                "manifest in several weeks or months that include neurological symptoms,\n" +
                "cardiac abnormalities, intermittent episodes of swelling and joint pains.");

        d20.setTREATMENT("Diagnosis and appropriate treatment must be determined by a physician.");

        d20.setPREVENTION("The best prevention to avoid tick bites includes the following:\n" +
                "• Avoid thick, brushy areas during the summer months\n" +
                "• Wear long sleeves and pants that hang over boots and shoes\n" +
                "• Check pets for ticks frequently\n" +
                "• Examine yourself frequently for ticks\n" +
                "• If ticks are found, remove them immediately and properly. To remove a tick\n" +
                "properly, use tweezers to grasp the tick by the mouthparts as close to the skin\n" +
                "as possible. Pull the tick straight out with gentle steady pressure. Take care\n" +
                "not to squeeze or crush the body of the tick during removal. Wash the bite\n" +
                "site with soap and water. Do not use hot matches, cigarettes, fingernail\n" +
                "polish, or petroleum jelly to remove ticks as these methods are not effective.\n" +
                "It is important to save the tick (preserved in alcohol) for later identification\n" +
                "by health officials as it helps assess the risk of disease.");

        diseaseModel.add(d20);

        //21

        DiseaseModel d21 = new DiseaseModel();

        d21.setDISEASE_ID(21);

        d21.setDISEASE_NAME("Plague");

        d21.setWHAT_IS_IT("Plague is caused by a rod-shaped bacterium Yersinia pestis. Known since ancient\n" +
                "times, plague has had a great influence on history, characterized by epidemics\n" +
                "and pandemics that have decimated human populations all over the world. \n\n Insect Vector\n" +
                "Plague is transmitted to humans and other\n" +
                "animals by bites from infected fleas. Fleas\n" +
                "become infected by ingesting the bacteria while\n" +
                "feeding on an infected animal.");

        d21.setWHERE_IS_IT_FOUND("Plague is referred to as “sylvatic” plague, which\n" +
                "means the disease has invaded “wild” rodent\n" +
                "populations. There are approximately 220\n" +
                "different species of rodents that can harbor plague, but the most common\n" +
                "sources for plague include ground squirrels and prairie dogs. ");

        d21.setHOW_IS_THE_DISEASE_SPREAD("Plague occurs worldwide, and is transmitted by bites from infected fleas. In\n" +
                "the United States, it occurs in the western states. Plague may be transmitted\n" +
                "by flea bites or through contact with blood and tissues of infected animals, or\n" +
                "through “pneumonic” transmission from sick humans or pets. Pneumonic\n" +
                "plague is transmitted from human to human, or from sick animal to human\n" +
                "by inhaling droplets from animals or humans that have pneumonic plague. ");

        d21.setSTAGES_OF_DISEASES("There are three primary forms of plague, and they include bubonic plague,\n" +
                "septicemic plague and pneumonic plague. The most common form of plague\n" +
                "is “bubonic” plague. Bubonic plague occurs from 1 to 7 days after a bite of an\n" +
                "infected flea. The disease is characterized by a characteristic skin lesion (which\n" +
                "occurs around the site of the flea bite), a “bubo” that is a swollen, tender\n" +
                "lymph node. Bubos usually affect the lymph nodes located in the inner thigh,\n" +
                "groin and under arm regions. Symptoms also include sudden high fever\n" +
                "(103˚F or 104˚F), headache, exhaustion, nausea, vomiting and delirium.\n" +
                "Secondary septicemic and pneumonic plague may occur when the bacterium\n" +
                "invades the blood stream and lungs. However, primary pneumonic plague\n" +
                "occurs when droplets are inhaled from infected humans or other animals. The\n" +
                "onset of pneumonic plague is rapid, and symptoms occur anywhere from 1 to\n" +
                "4 days after exposure. Symptoms of pneumonic plague may include high fever, headache, difficult breathing and coughing-up blood.\n" +
                "The fatality rate for untreated bubonic plague is 50% to 60%, and the fatality\n" +
                "rate for pneumonic plague is greater than 90%. Rapid diagnosis and\n" +
                "treatment can reduce these figures noticeably. ");

        d21.setTREATMENT("Diagnosis and treatment must be done by a physician");

        d21.setPREVENTION("The best prevention for plague includes the following:\n" +
                "• De-flea pets routinely – consult a veterinarian for advice on flea control\n" +
                "• Use insect repellents especially around pant cuffs, socks and shoes\n" +
                "• Do not camp next to rodent burrows and nests\n" +
                "• Avoid sleeping directly on the ground\n" +
                "• Do not pick up dead or sick rodents\n" +
                "• Wear gloves when field dressing game");

        diseaseModel.add(d21);

        //22

        DiseaseModel d22 = new DiseaseModel();

        d22.setDISEASE_ID(22);

        d22.setDISEASE_NAME("Rabies");

        d22.setWHAT_IS_IT("Rabies is caused by a “bullet-shaped” virus. The rabies virus can infect any\n" +
                "warm-blooded animal. Once introduced to a human host by an animal host,\n" +
                "the virus travels through the nervous system to the brain.");

        d22.setWHERE_IS_IT_FOUND("Common reservoirs include bats, skunks, foxes, coyotes, raccoons and\n" +
                "unvaccinated dogs");

        d22.setHOW_IS_THE_DISEASE_SPREAD("Rabies occurs all over the world. The virus is transmitted through a bite of an\n" +
                "infected animal. A rabid animal secretes the\n" +
                "virus in its saliva");

        d22.setSTAGES_OF_DISEASES("The early stages of the disease include\n" +
                "discomfort, anxiety and extreme sensitivity\n" +
                "around the bite wound. These symptoms are\n" +
                "followed by muscle spasms around the salivary\n" +
                "glands that result in hydrophobia (a fear of\n" +
                "water), delirium, coma and paralysis that\n" +
                "invariably leads to death.");

        d22.setTREATMENT("Human rabies immune globulin is injected by a physician at the wound site\n" +
                "as soon as possible, followed by 2 to 3 doses of the rabies vaccine. ");

        d22.setPREVENTION("The best prevention after exposure includes the following:\n" +
                "• Immediately wash the bite wound with soap and water\n" +
                "• If possible, capture the animal for testing – be careful not to re-expose\n" +
                "yourself or others (keep the dead animal chilled to prevent decomposition)\n" +
                "• Contact the local health department as soon as possible\n" +
                "• Seek medical attention immediately\n" +
                "Ways to prevent the spread of rabies from wild animals to pets is to have pets,\n" +
                "such as dogs and cats vaccinated for rabies routinely.");

        diseaseModel.add(d22);


        //23

        DiseaseModel d23 = new DiseaseModel();

        d23.setDISEASE_ID(23);

        d23.setDISEASE_NAME("Rocky Mountain Spotted Fever");

        d23.setWHAT_IS_IT("The disease-causing agent is a microorganism that occupies a position\\n\" +\n" +
                "                \"between viruses and bacteria. \\n\\nInsect Vector\\n\" +\n" +
                "                \"The vector for Rocky Mountain Spotted Fever is a certain tick species. The\\n\" +\n" +
                "                \"vector for this disease in the eastern part of the United States is the American\\n\" +\n" +
                "                \"dog, and the western tick is the Rocky Mountain wood tick known.");

        d23.setWHERE_IS_IT_FOUND("Sources for Rocky Mountain Spotted Fever include all stages of the American\n" +
                "dog tick and the wood tick, dogs, rodents and other animals.");

        d23.setHOW_IS_THE_DISEASE_SPREAD("Rocky Mountain Spotted Fever is common in the United States, parts of\n" +
                "Canada, Mexico and parts of South America.\n" +
                "Transmission occurs 4 to 6 hours after a tick has attached itself to a human\n" +
                "host, or if the tick is crushed or the feces rubbed into the bite wound.");

        d23.setSTAGES_OF_DISEASES("The characteristic symptom for this disease is a rash that appears within 2 to\n" +
                "5 days, usually on wrists, ankles at first, and later spreading all over the body.\n" +
                "Other symptoms commonly occur within 2 to 14 days and include moderate\n" +
                "to high fever, headache on the front and back of head, intense lower back pain\n" +
                "and discomfort. If the infection goes untreated the case fatality rate is 13% to 25%, however, if the disease is properly treated the case fatality rate is reduced\n" +
                "to 3% to 5%.");

        d23.setTREATMENT("Diagnosis and treatment must be done by a physician.");

        d23.setPREVENTION("The best prevention to avoid tick bites includes the following:\n" +
                "• Avoid thick, brushy areas during the summer months\n" +
                "• Wear long sleeves and pants that hang over boots and shoes\n" +
                "• Check pets for ticks frequently\n" +
                "• Examine yourself frequently for ticks\n" +
                "• If ticks are found, immediately remove them (be careful not to crush them\n" +
                "or rub their excrement into the bite wound)");

        diseaseModel.add(d23);



        //24

        DiseaseModel d24 = new DiseaseModel();

        d24.setDISEASE_ID(24);

        d24.setDISEASE_NAME("Tick Relapsing Fever");

        d24.setWHAT_IS_IT("The disease causing-agent for Tick Relapsing Fever is a bacterial spirochete. \n\n Insect Vector\n" +
                "The vector for this disease is an argasid tick that is also known as a soft tick.\n" +
                "These ticks are nocturnal feeders and hide in rodent nests during the day.\n" +
                "They do not attach to a host as do “hard” bodied ticks.");

        d24.setWHERE_IS_IT_FOUND("The primary sources are soft ticks and wild rodents.");

        d24.setHOW_IS_THE_DISEASE_SPREAD("Tick Relapsing Fever is common in both North and South America, parts of\n" +
                "Africa, Spain, Saudi Arabia, Iran and India. The disease is transmitted through\n" +
                "a bite from an infected soft tick, or by crushing a tick into a bite wound. Soft\n" +
                "ticks come out at night to feed on an animal host and then hide during the\n" +
                "day, typically in a rodent nest.");

        d24.setSTAGES_OF_DISEASES("The incubation period is 5 to 15 days. The onset of disease begins with a fever\n" +
                "that may last 2 to 9 days, subside for 2 to 4 days and reoccur again. This\n" +
                "relapsing fever cycle may occur 1 to 10 times. When the bacteria are present\n" +
                "in the blood a person will experience fever, then when bacteria leave the blood\n" +
                "there is no fever. The symptoms are most severe during the end of the fever\n" +
                "period, and 2% to 10% of all untreated cases will lead to death.");

        d24.setTREATMENT("Diagnosis and treatment must be done by a physician.");

        d24.setPREVENTION("To prevent Tick Relapsing Fever:\n" +
                "• Rodent proof cabins and treat areas with pesticides where rodent nests are\n" +
                "present\n" +
                "• If ticks are found, remove them immediately and properly. To remove a tick\n" +
                "properly, use tweezers to grasp the tick by the mouthparts as close to the skin\n" +
                "as possible. Pull the tick straight out with gentle steady pressure. Take care\n" +
                "not to squeeze or crush the body of the tick during removal. Wash the bite\n" +
                "site with soap and water. Do not use hot matches, cigarettes, fingernail\n" +
                "polish, or petroleum jelly to remove ticks as these methods are not effective.\n" +
                "It is important to save the tick (preserved in alcohol) for later identification\n" +
                "by health officials as it helps assess the risk of disease");

        diseaseModel.add(d24);

        //25

        DiseaseModel d25 = new DiseaseModel();

        d25.setDISEASE_ID(25);

        d25.setDISEASE_NAME("Tularemia");

        d25.setWHAT_IS_IT("The primary agent is a disease of rabbits and rodents caused by a bacteria This\n" +
                "disease is also known as “rabbit fever” or “deer fly fever”.");

        d25.setWHERE_IS_IT_FOUND("The primary sources for this disease are rabbits, hares, voles, muskrats, beavers\n" +
                "and various hard ticks.");

        d25.setHOW_IS_THE_DISEASE_SPREAD("Tularemia is found throughout the world and the United States. This disease\n" +
                "may be transmitted to humans by a variety of modes. Tularemia may be\n" +
                "transmitted from:\n" +
                "• Direct contact with infected blood and tissues from rabbits (cottontails,\n" +
                "jacks and snowshoes) and from wild rodents.\n" +
                "• Deer fly and tick bites that are infected with the bacteria.\n" +
                "• Consumption of raw or undercooked infected rabbit or rodent meat.\n" +
                "• Drinking raw water that has not been properly treated. ");

        d25.setSTAGES_OF_DISEASES("After an incubation period of 1 to 14 days the signs may include fever,\n" +
                "headache, chills, weakness and swollen lymph nodes in the armpit, elbow,\n" +
                "groin, or neck regions. Also, an open sore or ulcer usually appears on the skin\n" +
                "around the site of infection. When treated, Tularemia is rarely fatal.");

        d25.setTREATMENT("Diagnosis and treatment must be done by a physician.");

        d25.setPREVENTION("Prevention includes:\n" +
                "• Wearing gloves when skinning or field dressing rabbits or wild rodents.\n" +
                "• Wearing insect repellents in the backcountry, and avoiding brushy areas\n" +
                "where ticks may reside.\n" +
                "• Thoroughly cooking rabbit and wild rodent meat.\n" +
                "• Properly treating all drinking water, as described in the Water Purification\n" +
                "section of this manual.");

        diseaseModel.add(d25);


        return diseaseModel;


    }
}
