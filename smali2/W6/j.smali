.class public final synthetic LW6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LW6/l;


# direct methods
.method public synthetic constructor <init>(LW6/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/j;->q:LW6/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, LW6/j;->q:LW6/l;

    invoke-static {p0, p1}, LW6/l;->a(LW6/l;Landroid/view/View;)V

    return-void
.end method
