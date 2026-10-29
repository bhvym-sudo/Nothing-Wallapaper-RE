.class public final Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;
.super Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "End"
.end annotation


# instance fields
.field private final success:Z


# direct methods
.method public constructor <init>(Z)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;-><init>(Lkotlin/jvm/internal/h;)V

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;->success:Z

    return-void
.end method


# virtual methods
.method public final getSuccess()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;->success:Z

    return p0
.end method
