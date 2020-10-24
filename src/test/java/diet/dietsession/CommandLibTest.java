package diet.dietsession;

import commands.CommandLib;
import commands.diet.dietsession.FoodItemAdd;
import commands.diet.dietsession.FoodItemClear;
import commands.diet.dietsession.FoodItemDelete;
import commands.diet.dietsession.FoodItemHelp;
import commands.diet.dietsession.FoodItemList;
import commands.diet.dietsession.FoodItemWrong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLibTest {

    @Test
    void get_DietManagerUnrecognisedCommand_returnNull() {
        CommandLib cl = new CommandLib();
        cl.initDietSessionCL();
        assertTrue(cl.getCommand("asdf") instanceof FoodItemWrong);
    }

    @Test
    void get_list_returnListCommand() {
        CommandLib cl = new CommandLib();
        cl.initDietSessionCL();
        assertTrue(cl.getCommand("list") instanceof FoodItemList);
    }

    @Test
    void get_delete_returnDeleteCommand() {
        CommandLib cl = new CommandLib();
        cl.initDietSessionCL();
        assertTrue(cl.getCommand("delete") instanceof FoodItemDelete);
    }

    @Test
    void get_new_returnNewCommand() {
        CommandLib cl = new CommandLib();
        cl.initDietSessionCL();
        assertTrue(cl.getCommand("add") instanceof FoodItemAdd);
    }

    @Test
    void get_clear_returnClearCommand() {
        CommandLib cl = new CommandLib();
        cl.initDietSessionCL();
        assertTrue(cl.getCommand("clear") instanceof FoodItemClear);
    }

    @Test
    void get_help_returnHelpCommand() {
        CommandLib cl = new CommandLib();
        cl.initDietSessionCL();
        assertTrue(cl.getCommand("help") instanceof FoodItemHelp);
    }
}
