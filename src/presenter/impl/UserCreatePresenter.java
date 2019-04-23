package presenter.impl;

import domain.dto.UserCreateOutputData;
import domain.dto.UserCreateViewModel;
import presenter.IUserCreatePresenter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCreatePresenter implements IUserCreatePresenter {

    @Override
    public void complete(UserCreateOutputData outputData) {
        int userId = outputData.getUserId();
        Date createdDate = outputData.getCreated();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        UserCreateViewModel viewModel = new UserCreateViewModel(
                Integer.toString(userId),
                sdf.format(createdDate)
        );

        System.out.println(viewModel.getUserId());
        System.out.println(viewModel.getCreatedDate());
    }

}
