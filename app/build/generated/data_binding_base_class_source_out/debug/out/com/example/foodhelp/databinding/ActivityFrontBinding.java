// Generated by view binder compiler. Do not edit!
package com.example.foodhelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodhelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFrontBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Admin;

  @NonNull
  public final Button Shelter;

  @NonNull
  public final Button facilitator;

  private ActivityFrontBinding(@NonNull ConstraintLayout rootView, @NonNull Button Admin,
      @NonNull Button Shelter, @NonNull Button facilitator) {
    this.rootView = rootView;
    this.Admin = Admin;
    this.Shelter = Shelter;
    this.facilitator = facilitator;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFrontBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_front, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFrontBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Admin;
      Button Admin = ViewBindings.findChildViewById(rootView, id);
      if (Admin == null) {
        break missingId;
      }

      id = R.id.Shelter;
      Button Shelter = ViewBindings.findChildViewById(rootView, id);
      if (Shelter == null) {
        break missingId;
      }

      id = R.id.facilitator;
      Button facilitator = ViewBindings.findChildViewById(rootView, id);
      if (facilitator == null) {
        break missingId;
      }

      return new ActivityFrontBinding((ConstraintLayout) rootView, Admin, Shelter, facilitator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}