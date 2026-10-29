.class public final synthetic Ly7/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF2/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly7/S;


# direct methods
.method public synthetic constructor <init>(ILy7/S;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly7/H;->a:I

    iput-object p2, p0, Ly7/H;->b:Ly7/S;

    return-void
.end method


# virtual methods
.method public final a(LC2/b;Landroid/view/View;)Z
    .registers 4

    iget v0, p0, Ly7/H;->a:I

    iget-object p0, p0, Ly7/H;->b:Ly7/S;

    invoke-static {v0, p0, p1, p2}, Ly7/S;->q0(ILy7/S;LC2/b;Landroid/view/View;)Z

    move-result p0

    return p0
.end method
