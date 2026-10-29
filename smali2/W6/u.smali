.class public final synthetic LW6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Toolbar$OnMenuItemClickListener;


# instance fields
.field public final synthetic q:LW6/x;


# direct methods
.method public synthetic constructor <init>(LW6/x;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/u;->q:LW6/x;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .registers 2

    iget-object p0, p0, LW6/u;->q:LW6/x;

    invoke-static {p0, p1}, LW6/x;->a1(LW6/x;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method
