.class public final synthetic LW6/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Toolbar$OnMenuItemClickListener;


# instance fields
.field public final synthetic q:LW6/U;


# direct methods
.method public synthetic constructor <init>(LW6/U;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/G;->q:LW6/U;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .registers 2

    iget-object p0, p0, LW6/G;->q:LW6/U;

    invoke-static {p0, p1}, LW6/U;->Y0(LW6/U;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method
