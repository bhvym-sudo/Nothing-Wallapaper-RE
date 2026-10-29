.class public final synthetic LW6/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LW6/U;


# direct methods
.method public synthetic constructor <init>(LW6/U;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/O;->q:LW6/U;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, LW6/O;->q:LW6/U;

    invoke-static {p0, p1}, LW6/U;->f1(LW6/U;Landroid/view/View;)V

    return-void
.end method
