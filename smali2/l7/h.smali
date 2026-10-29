.class public final synthetic Ll7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Ll7/k;


# direct methods
.method public synthetic constructor <init>(Ll7/k;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/h;->q:Ll7/k;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Ll7/h;->q:Ll7/k;

    invoke-static {p0, p1}, Ll7/k;->g0(Ll7/k;Landroid/view/View;)V

    return-void
.end method
