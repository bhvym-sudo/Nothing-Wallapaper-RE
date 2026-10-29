.class public final synthetic LW6/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:LW6/U;


# direct methods
.method public synthetic constructor <init>(LW6/U;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/B;->a:LW6/U;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, LW6/B;->a:LW6/U;

    invoke-static {p0, p1}, LW6/U;->X0(LW6/U;Landroid/content/DialogInterface;)V

    return-void
.end method
