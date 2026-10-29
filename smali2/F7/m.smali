.class public final synthetic LF7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LF7/k$c;


# direct methods
.method public synthetic constructor <init>(LF7/k$c;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/m;->q:LF7/k$c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, LF7/m;->q:LF7/k$c;

    invoke-static {p0, p1}, LF7/k$c;->d(LF7/k$c;Landroid/view/View;)V

    return-void
.end method
